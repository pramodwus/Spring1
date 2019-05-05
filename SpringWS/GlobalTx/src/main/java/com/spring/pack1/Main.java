package com.spring.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
	Object o =ctx.getBean("accountImpl");
	AccountInter inter=(AccountInter)o;
	try
	{
		inter.transferMoney(101, 102, 3000);
	}
      catch(Exception e)
	{
    	  System.out.println(e);
    	  System.out.println("U r transaction unsuccessful");
	}
	}

}
