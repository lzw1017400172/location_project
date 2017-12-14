package com.lzw.mapper;

import com.lzw.model.HelloWorld;
import com.lzw.uitls.aspect.Pager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by LZW on 2017/12/12.
 */
@Repository
public interface HelloWorldMapper {
    void insert(@Param("cm")HelloWorld param);
    void update(@Param("cm")HelloWorld param);
    List<HelloWorld> queryList(@Param("cm")Map<String,Object> param);
    List<HelloWorld> queryListPage(@Param("page")Pager page,@Param("cm")Map<String, Object> param);
    Integer queryListTotal(@Param("cm")Map<String,Object> param);
}
