package com.oracle.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyHandlerException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		 String msg="";
		if(arg3 instanceof MyException){
			msg=((MyException)arg3).getMsg();
		}else{
			arg3.printStackTrace();
			msg="系统异常！解决不了";
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("show1");
		return modelAndView;
	}

}
