package pack1.exception;

public class InsufficientAmountException extends RuntimeException
{
	public InsufficientAmountException(String message)
	{
    super(message);
    }
}