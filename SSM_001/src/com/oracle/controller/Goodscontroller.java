package com.oracle.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.oracle.exception.MyException;
import com.oracle.pojo.Goods;
import com.oracle.service.GoodsService;

@Controller
@RequestMapping("good")
public class Goodscontroller {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("findAll")
	public ModelAndView findAll(String name){
		List<Goods> selectAll = goodsService.selectAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("selectAll", selectAll);
		modelAndView.setViewName("show");
		return modelAndView;
	}
	@RequestMapping("exceptionDemo")
	public String MyExceptionDemo(int num) throws MyException{
		if(num==0){
		MyException myException = new MyException();
		myException.setMsg("insert Exception");
		throw myException;
		}
		else{
			return "index";
		}
	}
	@RequestMapping("file")
	@ResponseBody
	public String test0(HttpServletRequest request,
			@RequestParam("imgs")MultipartFile file){
		String path=request.getServletContext().getRealPath("/img");
		try {
			file.transferTo(new File(path+"/"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ok";
	}
}
