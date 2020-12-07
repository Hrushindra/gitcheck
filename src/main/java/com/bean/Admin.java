package com.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ad") 
//@Scope("prototype")-->by default this scope is singleton
public class Admin {

	private int aId;
	private String aName;
	@Autowired
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public void display()
	{
		System.out.println("admin display method called....");
		System.out.println(aId+"-"+aName);
		System.out.println(date);
	}
}
