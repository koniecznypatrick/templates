package com.apside.template.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://soap.ws.template.apside.com/", portName = "HelloWorldPort", serviceName = "HelloWorldService")
public class HelloWorld {

	@WebMethod
	public String sayHello(String name) {
		return "Hello "+name;
	}
	
	@WebMethod
	public String ping() {
		return "pong";
	}
}
