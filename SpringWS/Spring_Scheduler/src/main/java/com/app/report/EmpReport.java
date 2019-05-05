package com.app.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmpReport {
 /*
	@Scheduled(fixedDelay=5000)
	public void repGen()
	
	{
		System.out.println(new Date());
	}
	
	*/
	@Scheduled(cron="*/10 * * * * *")
	public void nameGen()
	{   System.out.println(new Date());
		System.out.println("I m Amit Verma");
		
	}
	
	
	
	
	
	
	
	
}
