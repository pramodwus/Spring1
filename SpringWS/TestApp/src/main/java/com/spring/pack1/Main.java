package com.spring.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo db=(Demo)ctx.getBean("db");
        try
        {
        	db.method1();
        }catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}
