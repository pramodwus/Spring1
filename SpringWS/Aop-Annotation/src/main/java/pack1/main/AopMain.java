package pack1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack1.configuration.AopConfig;
import pack1.model.Demo;

public class AopMain {

	public static void main(String... args) {
    ApplicationContext ctx=new AnnotationConfigApplicationContext(AopConfig.class);
         Object o =ctx.getBean("demoImple");
         Demo d=(Demo)o;
         try
         {
        	 d.businessMethod1(1000);
        	 
        	 
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
         System.out.println("=========================");
	     d.businessMethod2();
	     System.out.println("=========================");
	     try
	     {
	    	 d.businessMethod1(-1000);
	    	 
	    	 
	     }catch(Exception e)
	     {
	    	 System.out.println(e);
	    	 
	     }
	
	
	
	}

}
