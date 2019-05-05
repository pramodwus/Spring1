package defaultpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack1.bo.TestBean;

public class Main {

	public static void main(String...args)
	{
     ApplicationContext ctx=
    		 new AnnotationConfigApplicationContext(pack1.configuration.AppConfig.class);
             TestBean testBean=(TestBean)ctx.getBean("testBean");
             testBean.m1();
             System.out.println("======================================================");
             testBean.m2();
             System.out.println("======================================================");
             testBean.m3();
             
             
             
             
             
	}

}
