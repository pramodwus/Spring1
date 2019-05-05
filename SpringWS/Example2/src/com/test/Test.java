package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.WelcomeBeans;

public class Test {

	public static void main(String[] args) {
		//start spring container
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/config.xml");
		
		//read object form contanier
		Object o=ctx.getBean("WelcomeBeans");
		WelcomeBeans Wbean=(WelcomeBeans)o;
		
		//call welcomebean method
		
		Wbean.showMsg();
		
	}

}
