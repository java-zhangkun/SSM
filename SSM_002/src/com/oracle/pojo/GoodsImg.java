package com.oracle.pojo;

import java.io.Serializable;

public class GoodsImg implements Serializable {
    private Integer imgId;

    private String imgPath;

    private Integer imgGoods;

    private static final long serialVersionUID = 1L;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getImgGoods() {
        return imgGoods;
    }

    public void setImgGoods(Integer imgGoods) {
        this.imgGoods = imgGoods;
    }
}