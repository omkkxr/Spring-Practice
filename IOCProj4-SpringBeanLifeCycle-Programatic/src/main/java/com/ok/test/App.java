package com.ok.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ok.beans.VoterVerifier;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ok/cfgs/applicationContext.xml");
    	VoterVerifier voter1=ctx.getBean("voter",VoterVerifier.class);
    	System.out.println(voter1.checkVotingElgibility());
    	ctx.close();
    }
}
