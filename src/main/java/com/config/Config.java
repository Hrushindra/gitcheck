 package com.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.EmployeeDetail;

@Configuration 
@ComponentScan(basePackages = "com.bean")
public class Config
{
	@Bean
	public Date getDate()
	{
		return new Date();
	}
	/*@Bean-->i dont need to make these class as bean here as i can make it bean through component annotation
	public EmployeeDetail getDetail()
	{
		return new EmployeeDetail();
	}*/
}
