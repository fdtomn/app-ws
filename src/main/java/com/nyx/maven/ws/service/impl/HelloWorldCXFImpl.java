package com.nyx.maven.ws.service.impl;

import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.nyx.maven.ws.service.IHelloWorldCXF;

@WebService(endpointInterface="com.nyx.maven.ws.service.IHelloWorldCXF")
public class HelloWorldCXFImpl implements IHelloWorldCXF {

	@Override
	public String sayHello() {
		return "Hello CXF";
	}

	@Override
	public String test(@WebParam(name="name")String name) {
		return new Date() + "---" + name;
	}

}
