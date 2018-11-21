package com.oracle.mapper;

import com.oracle.pojo.Permissions;

public interface PermissionsMapper {
    int insert(Permissions record);

    int insertSelective(Permissions record);
}