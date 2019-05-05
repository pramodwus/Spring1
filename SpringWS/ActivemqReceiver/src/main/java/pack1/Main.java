package pack1;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// init spring context
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	         
	    // get bean from context
         JmsMessageReceiver jmsMessageReceiver =(JmsMessageReceiver)ctx.getBean("jmsMessageReceiver");
        try {
			jmsMessageReceiver.receiveMsg();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

}
}
