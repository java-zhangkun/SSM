package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.mapper.GoodsMapper;
import com.oracle.pojo.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=true)
	public List<Goods> selectAll(){
		List<Goods> findAll = goodsMapper.findAll();
		return findAll;
	}
}
