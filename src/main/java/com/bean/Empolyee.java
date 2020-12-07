package com.bean;

import java.util.Date;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Empolyee {

	private int eId;
	private String eName;
	private List<String> hobbies;
	private Map<Integer, String> ranks;
	@Autowired 
	private Date date;
	@Autowired
	private EmployeeDetail ed;
	
	
	/*public Empolyee(int eId, String eName) {
		
		this.eId = eId;
		this.eName = eName;
	}*/


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Map<Integer, String> getRanks() {
		return ranks;
	}

	public void setRanks(Map<Integer, String> ranks) {
		this.ranks = ranks;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EmployeeDetail getEd() {
		return ed;
	}

	public void setEd(EmployeeDetail ed) {
		this.ed = ed;
	}


	public void display()
	{
		System.out.println("display method in bean");
		System.out.println(eId+"-"+eName);
		
		for(String s:hobbies)
			System.out.println(s);
		
		for(Map.Entry m:ranks.entrySet() )
			System.out.println(m.getKey()+"-"+m.getValue() );
		System.out.println(date.getDate()); 
		
		System.out.println(ed.getCity());
	}




}
