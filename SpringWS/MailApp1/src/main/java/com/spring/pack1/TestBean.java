package com.spring.pack1;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class TestBean 
{
private JavaMailSenderImpl mailSender;
public void setMailSender(JavaMailSenderImpl mailSender)
{
	this.mailSender=mailSender;
	
}
public void sendEmail()
{
	
try
{
	SimpleMailMessage smm=new SimpleMailMessage();
	smm.setTo("harie859@gmail.com");
	smm.setSubject("mail from amit");
	smm.setText("this is a wish mail from amit good eveing");
	mailSender.send(smm);
	System.out.println("mail sent successfully");
	
	
	
}
catch(Exception e)
{
	System.out.println(e);
}
	
	
}


}
