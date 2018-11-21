package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.mapper.GoodsMapper;
import com.oracle.pojo.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	public PageInfo<Goods> findAll(Integer page,Integer size){
		PageHelper.startPage(page, size,"goods_id");
		List<Goods> list = goodsMapper.findAll();
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);
		return pageInfo;
	}
}
