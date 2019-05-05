package com.spring.pack1;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class DemoBean implements Demo
{
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		
		this.jt=jt;
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.SERIALIZABLE,timeout=5)
	public void method1() 
	{
	jt.update("insert into dept values(20,'RESEARCH','HYD')");
	jt.update("update emp set sal=9000 where empno=7788");
	try
	{
		Thread.sleep(10000);
		
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
	jt.update("delete from loan where loan_id=101 ");
	
	}

}
