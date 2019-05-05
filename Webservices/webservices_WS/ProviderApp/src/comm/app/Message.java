package comm.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msg")
public class Message {
@GET
public String shoeMsg()
{
	
	return "Hello Amit ";
	
}
	
	
	
	
}
