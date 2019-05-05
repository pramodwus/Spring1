package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {
	public static void main(String[] args) {
		String url="http://localhost:2018/ProviderApp/rest/msg";
	
	//Create one Empty Client Object
		Client c1=Client.create();
		//add url to client
		WebResource wr=c1.resource(url);
		//make a Request Call
		ClientResponse cr=wr.get(ClientResponse.class);
		
		//read entity from cr
		String str=cr.getEntity(String.class);
		//s print Entity
		System.out.println(str);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	
	
	
	
	
	}

}
