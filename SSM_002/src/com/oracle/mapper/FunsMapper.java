package com.oracle.mapper;

import com.oracle.pojo.Funs;

public interface FunsMapper {
    int deleteByPrimaryKey(Integer funId);

    int insert(Funs record);

    int insertSelective(Funs record);

    Funs selectByPrimaryKey(Integer funId);

    int updateByPrimaryKeySelective(Funs record);

    int updateByPrimaryKey(Funs record);
}