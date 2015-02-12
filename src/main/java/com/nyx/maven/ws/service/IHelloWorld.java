package com.nyx.maven.ws.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.nyx.maven.ws.domain.User;
import com.nyx.maven.ws.util.MapAdapter;


/**
 * 定义服务接口
 * @author Trust
 *
 */
@WebService
@XmlSeeAlso({User.class})
public interface IHelloWorld {
	
	public String sayHello(@WebParam(name="message")String message);
	
	@WebMethod
	@XmlJavaTypeAdapter(MapAdapter.class)
	@WebResult
	public Map<String, User> getMapInfo();
	
	@WebMethod
	@WebResult
	public List<User> getAllUser();
	
	public User[] getAllUserArr();
	
}
