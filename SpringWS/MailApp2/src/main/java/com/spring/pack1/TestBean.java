package com.spring.pack1;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

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
    		MimeMessage msg=mailSender.createMimeMessage();
    		MimeMessageHelper helper =new MimeMessageHelper(msg,true);
    		helper.setTo("amitkumar200796@gmail.com");
    		helper.setSubject("Mail from spring application");
    		helper.setText("this a test mail with attachment from amit");
    		FileSystemResource fsr=new FileSystemResource("D://amit.jpg");
    		helper.addAttachment("amit.jpg",fsr);
    		mailSender.send(msg);
    		System.out.println(" the mail sent succesfully");
    		
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    	
    }
	
}
