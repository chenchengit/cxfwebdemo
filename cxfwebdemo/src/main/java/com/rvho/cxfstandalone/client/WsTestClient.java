package com.rvho.cxfstandalone.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.rvho.cxfclient.wsdl.cxf.hello.HelloWS;

public class WsTestClient {

	public static void main(String args[]){
		//jaxws调用
		//URL不是必须的，除非服务的地址有改变
		//			wsdlUrl = new URL("http://localhost:8999/services/hello?wsdl");
		//			HelloWSService helloWSS = new HelloWSService(wsdlUrl);
//		HelloWSService helloWSS = new HelloWSService();
//		HelloWS helloWS = helloWSS.getHelloWSPort();
//		String welcome = helloWS.welcome("accountwcx@qq.com");
//		System.out.println(welcome);
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWS.class);
		factory.setAddress("http://localhost:8081/services/hello");
		HelloWS helloWS = factory.create(HelloWS.class);
		String welcome = helloWS.welcome("accountwcx@qq.com");
		System.out.println(welcome);
	}
}
