package com.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component 
public class LifeCycle
{
	@PostConstruct    //this annotation make the method as init method we need not to make method name as init 
	public void check()
	{
		System.out.println("init method called...");
	}
	
	public void display()
	{
		System.out.println("this is service method...");
	}
	
	@PreDestroy		//this annotation make the method as destroy method we need not to make method name as destroy
	public void destroy()
	{
		System.out.println("this is destroy method...");
	}
}
