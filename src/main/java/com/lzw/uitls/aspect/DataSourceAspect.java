package com.lzw.uitls.aspect;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 切换数据源(不同方法调用不同数据源)
 * 
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:17:52
 */
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DataSourceAspect {
	private final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

	/*定义切入点*/
	@Pointcut("execution(* com.lzw.service..*.*(..))")
	public void aspect() {
	}

	/**
	 * 配置前置通知,使用在方法aspect()上注册的切入点
	 */
	@Before("aspect()")//如果定义多个切入点，使用 || 符号隔开
	public void before(JoinPoint point) {
		System.out.println("触发前置通知======，注入数据源");
		String className = point.getTarget().getClass().getName();
		String method = point.getSignature().getName();
		logger.info(className + "." + method + "(" + StringUtils.join(point.getArgs(), ",") + ")");
		try {
			L: for (String key : ChooseDataSource.METHODTYPE.keySet()) {
				for (String type : ChooseDataSource.METHODTYPE.get(key)) {
					if (method.startsWith(type)) {
						logger.info(key);
						//把key作为数据源名称注入
						HandleDataSource.putDataSource(key);
						break L;
					}
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			HandleDataSource.putDataSource("write");
		}
	}

	@After("aspect()")
	public void after(JoinPoint point) {
		System.out.println("触发后置通知======，clear数据源");
		HandleDataSource.clear();
	}
}
