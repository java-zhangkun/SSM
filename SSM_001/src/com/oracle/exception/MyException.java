package com.oracle.exception;

public class MyException extends RuntimeException {
	private String msg;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
