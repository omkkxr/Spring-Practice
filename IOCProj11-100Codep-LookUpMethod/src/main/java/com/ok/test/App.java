package com.ok.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ok.beans.Criketer;
import com.ok.config.AppConfig;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Criketer ckt=ctx.getBean("ckt",Criketer.class);
        ckt.bowling();
        ckt.feilding();
        ckt.batting();
        ctx.close();
    }
}
