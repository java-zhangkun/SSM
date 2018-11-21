package com.oracle.pojo;

import java.io.Serializable;

public class Funs implements Serializable {
    private Integer funId;

    private String funName;

    private String funUrl;

    private Integer funPid;

    private String funTarget;

    private static final long serialVersionUID = 1L;

    public Integer getFunId() {
        return funId;
    }

    public void setFunId(Integer funId) {
        this.funId = funId;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName == null ? null : funName.trim();
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl == null ? null : funUrl.trim();
    }

    public Integer getFunPid() {
        return funPid;
    }

    public void setFunPid(Integer funPid) {
        this.funPid = funPid;
    }

    public String getFunTarget() {
        return funTarget;
    }

    public void setFunTarget(String funTarget) {
        this.funTarget = funTarget == null ? null : funTarget.trim();
    }
}