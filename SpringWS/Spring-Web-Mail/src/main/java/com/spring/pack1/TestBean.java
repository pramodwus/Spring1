package com.spring.pack1;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class TestBean {
private JavaMailSenderImpl mailSender;
public void setMailSender(JavaMailSenderImpl mailSender)
{
	
	this.mailSender=mailSender;
	
}
  public void sendEmail(String to,String subject,String content)	
  {
	try
	{
	SimpleMailMessage smm=new SimpleMailMessage();	
	smm.setTo(to);
	smm.setSubject(subject);
	smm.setText(content);	
	mailSender.send(smm);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
  }
	
}
