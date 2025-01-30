package com.ok.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterVerifier {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	private Date date;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Spring bean init --> life cycle method
//	public void init() {
//		System.out.println("init() :: \n");
//		date=new Date();
//		if(age<=0 | name==null) {
//			throw new IllegalArgumentException("Invalid bean properties : name,age.");
//		}
//	}
//	
//	public void des() {
//		System.out.println("Destory method of spring bean life cycle.");
//		age=0;
//		name=null;
//		date=null;
//	}
	@PostConstruct
	public void init1() throws Exception {
		System.out.println("init() :: of Annotation approach.\n");
		date = new Date();
		if (age <= 0 | name == null) {
			throw new IllegalArgumentException("Invalid bean properties : name,age.");
		}
	}

	@PreDestroy
	public void des1() throws Exception {
		System.out.println("Destory method of spring bean life cycle.-->Annotation apprpoach");
		age = 0;
		name = null;
		date = null;
	}

	public String checkVotingElgibility() {
		if (age < 18) {
			return name + " is not elgibal for voting on-->" + date;
		} else {
			return name + " is  elgibal for voting on-->" + date;
		}
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Destory method of spring bean life cycle.-->programatic Approach.");
//		age=0;
//		name=null;
//		date=null;
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("init() :: of Programatic approach. \n");
//		date=new Date();
//		if(age<=0 | name==null) {
//			throw new IllegalArgumentException("Invalid bean properties : name,age.");
//		}
	}
}
