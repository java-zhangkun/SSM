package com.oracle.pojo;

import java.io.Serializable;

public class Permissions implements Serializable {
    private Integer permissionRole;

    private Integer permissionFun;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionRole() {
        return permissionRole;
    }

    public void setPermissionRole(Integer permissionRole) {
        this.permissionRole = permissionRole;
    }

    public Integer getPermissionFun() {
        return permissionFun;
    }

    public void setPermissionFun(Integer permissionFun) {
        this.permissionFun = permissionFun;
    }
}