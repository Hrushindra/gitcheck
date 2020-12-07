package com.client;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Admin;
import com.config.Config;

public class AdminClient
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Admin admin=(Admin)ctx.getBean("ad");
		Admin admin1=(Admin)ctx.getBean("ad");
		admin.setaId(101);
		admin.setaName("meet");
		System.out.println(admin.hashCode());
		System.out.println(admin1.hashCode());
		admin.display();
		
	}
}	
