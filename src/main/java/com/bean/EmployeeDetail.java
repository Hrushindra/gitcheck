package com.bean;

import org.springframework.stereotype.Component;
@Component
public class EmployeeDetail
{
	private String city;
	private String state;
	
	
	public EmployeeDetail() {
		
		this.city = "Ahmedabad";
		this.state = "Gujarat";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
