package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.beans.WelcomeBeans;

public class Test {

	public static void main(String[] args) {
		//start spring container
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sathya/config/config.xml");
		//read object form contanier
		Object o=ctx.getBean("WelcomeBeans");
		WelcomeBeans Wbean=(WelcomeBeans)o;
		//call welcomebean method
		Wbean.showMsg();
		
	}

}
