package pack1.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		// init spring context
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Object obj=ctx.getBean("productImpl");
	    Product p=(Product)obj;
       System.out.println("====================================");
       p.add(10, 20);
       System.out.println("====================================");
       p.multiply(10, 30);
       
	}

}
