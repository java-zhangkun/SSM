package com.oracle.mapper;

import com.oracle.pojo.Admins;

public interface AdminsMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admins record);

    int insertSelective(Admins record);

    Admins selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}