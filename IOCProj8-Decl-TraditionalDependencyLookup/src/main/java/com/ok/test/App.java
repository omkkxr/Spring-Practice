package com.ok.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ok.beans.Criketer;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ok/cfgs/applicationContext.xml");
        Criketer ckt=ctx.getBean("ckt",Criketer.class);
        ckt.bowling();
        ckt.feilding();
        ckt.batting();
        ctx.close();
        
    }
}
