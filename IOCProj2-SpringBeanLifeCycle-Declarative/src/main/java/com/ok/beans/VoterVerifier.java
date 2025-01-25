package com.ok.beans;

import java.util.Date;

public class VoterVerifier {
	private String name;
	private int age;
	private Date date;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Spring bean init --> life cycle method
	public void init() {
		System.out.println("init() :: \n");
		date=new Date();
		if(age<=0 | name==null) {
			throw new IllegalArgumentException("Invalid bean properties : name,age.");
		}
	}
	
	public void des() {
		System.out.println("Destory method of spring bean life cycle.");
		age=0;
		name=null;
		date=null;
	}
	public String checkVotingElgibility() {
		if(age<18) {
			return name+" is elgibal for voting on-->"+date;
		}else {
			return name+" is not elgibal for voting on-->"+date;
		}
	}
}
