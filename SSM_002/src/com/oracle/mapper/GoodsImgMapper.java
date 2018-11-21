package com.oracle.mapper;

import com.oracle.pojo.GoodsImg;

public interface GoodsImgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(GoodsImg record);

    int insertSelective(GoodsImg record);

    GoodsImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(GoodsImg record);

    int updateByPrimaryKey(GoodsImg record);
}