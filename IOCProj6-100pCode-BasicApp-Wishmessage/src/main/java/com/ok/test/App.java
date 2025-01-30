package com.ok.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ok.beans.WishMessageGenarator;
import com.ok.cfgs.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       WishMessageGenarator wmg=ctx.getBean("wmg",WishMessageGenarator.class);
       System.out.println(wmg.wishMessage("Omkar"));
    }
}
