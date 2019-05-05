package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	    // init spring context
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	         
	    // get bean from context
	    JmsMessageSender jmsMessageSender = (JmsMessageSender)ctx.getBean("jmsMessageSender");
	         
	    // send to default destination 
	    jmsMessageSender.sendMsg("This is first  message for receiver mr amit");
	}

}
