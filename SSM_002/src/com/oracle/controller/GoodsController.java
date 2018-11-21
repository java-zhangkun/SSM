package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.oracle.pojo.Goods;
import com.oracle.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("goods/findAll")
	public String findAll(Model model,Integer page,Integer size){
		if(page==null || page==0){
			page=1;
		}
		if(size==null || page==0){
			size=6;
		}
		PageInfo<Goods> pageInfo = goodsService.findAll(page,size);
		model.addAttribute("list",pageInfo);
		return "detail";
	}
	@RequestMapping("goods")
	public String index(){
		return "goodslist";
	}
	
}
