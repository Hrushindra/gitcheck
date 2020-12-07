package com.client;
//abcde

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.bean.EmployeeDetail;
import com.bean.Empolyee;
import com.config.Config;


public class EmployeeClient 
{
	public static void main(String[] args)
	{
		//how to start container-->make its object-->like below of xmlfactory
		
		
		//file configuration 
		//lazy loading-lazy binding
		//FileSystemResource res=new FileSystemResource("src\\main\\java\\com\\config\\AppContext.xml");
		//container will start
		//XmlBeanFactory factory=new XmlBeanFactory(res);	
		//spring bean obejct
		//Empolyee employee=(Empolyee) factory.getBean("emp"); 
		//employee.display();
		
		//early loading-early binding
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src\\main\\java\\com\\config\\AppContext.xml");
		//spring bean obejct
	
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);

		Empolyee emp=(Empolyee) ctx.getBean("empolyee");
		
		emp.seteId(101);
		emp.seteName("meet");
		List<String> hobbies=new ArrayList<String>();
		hobbies.add("reading");
		hobbies.add("sleeping");
		hobbies.add("cricket");
		Map<Integer,String > ranks =new HashMap();
		ranks.put(1, "bhavsar");
		ranks.put(2,"meet");
		emp.setHobbies(hobbies);
		emp.setRanks(ranks);
		emp.display();
	}
}
