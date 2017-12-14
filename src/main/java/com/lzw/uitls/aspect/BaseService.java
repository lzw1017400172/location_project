package com.lzw.uitls.aspect;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by LZW on 2017/12/14.
 */
public class BaseService<T> {

    public Pager<T> getPage(Map<String, Object> params) {
        Integer current = 1;
        Integer size = 10;
        if (isNotEmpty(params.get("pageNO"))) {
            current = Integer.valueOf(params.get("pageNO").toString());
        }
        if (isNotEmpty(params.get("pageIndex"))) {
            current = Integer.valueOf(params.get("pageIndex").toString());
        }
        if (isNotEmpty(params.get("pageSize"))) {
            size = Integer.valueOf(params.get("pageSize").toString());
        }
        Pager<T> page = new Pager<>();
        page.setPageSize(size);
        page.setPageNO(current);
        return page;
    }

    public boolean isNotEmpty(Object object){
        if(object == null){
            return false;
        }
        if(object.toString() == null){
            return false;
        }
        if("".equals(object.toString())){
            return false;
        }
        return  true;
    }

}
