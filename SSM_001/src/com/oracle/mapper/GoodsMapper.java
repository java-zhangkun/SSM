package com.oracle.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.oracle.pojo.Goods;
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    List<Goods> findAll();
}