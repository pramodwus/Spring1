package com.spring.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
	Object o=context.getBean("id2");
	TestBean tb=(TestBean)o;
	tb.sendEmail();
}
}
