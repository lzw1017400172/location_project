package com.lzw.service;

import com.lzw.model.HelloWorld;
import com.lzw.uitls.aspect.Pager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by LZW on 2017/12/9.
 */
public interface ChenYaXianService {

     public void saveOrUpdate(HelloWorld model);

     public Pager<HelloWorld> queryList(Map<String,Object> param);

}
