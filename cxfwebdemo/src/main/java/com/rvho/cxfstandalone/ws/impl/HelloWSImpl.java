package com.rvho.cxfstandalone.ws.impl;

import javax.jws.WebService;

import com.rvho.cxfstandalone.ws.HelloWS;

@WebService(endpointInterface = "com.rvho.cxfstandalone.ws.HelloWS", portName = "HelloWSPort", serviceName = "HelloWSService", targetNamespace = "http://www.tmp.com/services/hello")
public class HelloWSImpl implements HelloWS {
	@Override
	public String welcome(String name) {
		return "Welcome " + name;
	}

}
