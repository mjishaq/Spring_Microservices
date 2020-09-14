package com.springBoot.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {

	private String msg;

	public HelloWorldBean(String msg) {
		this.setMsg(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString()
	{
		return String.format("HelloWorldBean  [message =%s]", msg);
		
	}

}
