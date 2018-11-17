package com.oracle.tests;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.oracle.mapper.GoodsMapper;
import com.oracle.pojo.Goods;
@Service
public class Demo {
	
	@Test
	public void Demo(){
		/*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsMapper goodsMapper = (GoodsMapper) context.getBean("goodsMapper");
		List<Goods> findAll = goodsMapper.findAll();
	//	goodsMapper.selectByPrimaryKey(goodsId)
		for (Goods g:findAll) {
			System.out.println(g.getGoodsName()+"-------"+g.getGoodsType());
		}*/
	}
}
