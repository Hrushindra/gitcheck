package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.LifeCycle;
import com.config.Config;

public class LifeCycleClient 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		LifeCycle lc=(LifeCycle) ctx.getBean("lifeCycle");
		lc.display();
		ctx.close();
	}
}
