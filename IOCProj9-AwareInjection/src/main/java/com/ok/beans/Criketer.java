package com.ok.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("ckt")
public class Criketer implements ApplicationContextAware {
	@Autowired
	private CriketerBat bat;
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Criketer.setApplicationContext() :: Aware Injection.");
		this.ctx = ctx;
	}

	
	public void feilding() {
		System.out.println("Criketer is doing feilding. ");
	}

	public void bowling() {
		System.out.println("Criketer is doing bowling. ");
	}

	public void batting() {
		System.out.println("batting() method of Criketer. ");

		CriketerBat bat = ctx.getBean("bat", CriketerBat.class);
		int runs = bat.scoreRun();
		System.out.println("Criketer is batting on : " + runs);
		((AbstractApplicationContext) ctx).close();
	}

}