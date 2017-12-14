package com.lzw.service.impl;

import com.lzw.mapper.HelloWorldMapper;
import com.lzw.model.HelloWorld;
import com.lzw.service.ChenYaXianService;
import com.lzw.uitls.aspect.BaseService;
import com.lzw.uitls.aspect.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by LZW on 2017/12/9.
 */
@Service
public class ChenYaXianServiceImpl extends BaseService<HelloWorld> implements ChenYaXianService{

    @Autowired
    private HelloWorldMapper helloWorldMapper;

    @Override
    public void saveOrUpdate(HelloWorld model) {
        if(model.getId() == null){
            model.setCreateTime(new Date());
            helloWorldMapper.insert(model);
        } else {
            helloWorldMapper.update(model);
        }
    }

    @Override
    public Pager<HelloWorld> queryList(Map<String,Object> param) {

        Integer total = helloWorldMapper.queryListTotal(param);
        Pager<HelloWorld> page = getPage(param);
        page.setTotalCount(total);
        page.setResult(helloWorldMapper.queryListPage(page,param));
        return page;
    }
}
