package com.lzw.AopController;


import com.lzw.model.HelloWorld;
import com.lzw.service.ChenYaXianService;
import com.lzw.uitls.aspect.returnMap.ReturnMap;
import javafx.scene.control.Pagination;
import org.apache.ibatis.ognl.IntHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhuang
 * @since 2017-06-28
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

	@Autowired
	private ChenYaXianService service;

	@RequestMapping()
    @ResponseBody
	public Object saveOrUpdate(@RequestBody HelloWorld param, HttpServletResponse response) {
        service.saveOrUpdate(param);
        return new ReturnMap("done");
	}

	@RequestMapping("/queryList")
    @ResponseBody
	public Object queryList(@RequestBody Map<String,Object> param, HttpServletResponse response) {
        return new ReturnMap("done",service.queryList(param));
    }
}
