package com.nyx.maven.ws.service.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nyx.maven.ws.domain.User;

@Path("/user")
public interface IUserService {

//	@GET
//	@Path("/getUser/{id}")
//	@Produces({MediaType.APPLICATION_XML})
//	public User getUser(@PathParam("id")String id);

	@GET
	@Path("/users.xml")
	@Produces({MediaType.APPLICATION_XML})
	List<User> getAllUserXML();

	@GET
	@Path("/users.json")
	@Produces({MediaType.APPLICATION_JSON})
	List<User> getAllUserJSON();
	
}
