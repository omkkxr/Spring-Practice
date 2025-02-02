package com.ok.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Criketer {
	private String bat;

	public Criketer(String bat) {
		this.bat = bat;
		System.out.println("Criketer :: 0-param constructor");
	}

	public void feilding() {
		System.out.println("Criketer is doing feilding. ");
	}

	public void bowling() {
		System.out.println("Criketer is doing bowling. ");
	}

	public void batting() {
		System.out.println("batting() method of Criketer. ");
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/ok/cfgs/applicationContext.xml");
		CriketerBat bat = ctx.getBean("bat", CriketerBat.class);
		int runs = bat.scoreRun();
		System.out.println("Criketer is batting on : " +this.bat+" "+ runs);
		ctx.close();
	}
}