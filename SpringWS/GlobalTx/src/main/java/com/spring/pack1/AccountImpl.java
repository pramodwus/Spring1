package com.spring.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountImpl implements AccountInter {
  @Autowired
  private JdbcTemplate jt1;
  @Autowired
  private JdbcTemplate jt2;
  
  
  
  @Transactional(timeout=8,isolation=Isolation.SERIALIZABLE)
	public void transferMoney(int accno1, int accno2, int amount) throws Exception {
	int s1=jt1.queryForObject("select bal from account1 where acno=?",new Object[] {accno1},Integer.class);
//deduct amt from bal
	int s2=s1-amount;
	if(s2<500)
	{
		throw new Exception();
	}
	int s3=jt2.queryForObject("select bal from account2 where accno=?",new Object[] {accno2},Integer.class);
	//add amt to  bal
	int s4=s3+amount;
	jt1.update("update Account1 set bal=? where acno=?",s2,accno1);
	Thread.sleep(6000);
	jt2.update("update Account2 set bal=? where accno=?",s4,accno2);
	System.out.println("Transaction successful...........");
	
  
  
  
  }

}
