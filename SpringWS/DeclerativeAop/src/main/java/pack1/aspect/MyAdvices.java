package pack1.aspect;
import org.aspectj.lang.JoinPoint;
public class MyAdvices {

	public void before(JoinPoint jp)
	{
	String methodName=jp.getSignature().getName();	
	Object args[]=jp.getArgs();
	System.out.println("I m before advice to :"+methodName);
	System.out.println("It's arguments value are : "+args[0]+","+args[1]);

	
	}
    public void afterReturning(JoinPoint jp,Object result)	
    {
    	
    	String methodName=jp.getSignature().getName();	
    	Object args[]=jp.getArgs();
    	System.out.println("I m after Returning advice to :"+methodName);
    	System.out.println("It's arguments value are : "+args[0]+","+args[1]);
	
        System.out.println("the result of this method is :"+result);           	
    	
    	
    	
    	
    }
	
}
