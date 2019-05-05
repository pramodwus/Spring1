package pack1.model;

import org.springframework.stereotype.Service;

import pack1.exception.InsufficientAmountException;

@Service
public class DemoImple implements Demo {

	public void businessMethod1(int amount) throws Exception {
		if(amount<=0)
			throw new InsufficientAmountException("U have given Amount as :"+amount+" it is not valid");
		else
			System.out.println("Amount is : "+amount+" it is valid");
	}

	public void businessMethod2() {
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}

	}

}
