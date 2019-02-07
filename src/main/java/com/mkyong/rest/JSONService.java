package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Country;

@Path("/json/countries")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getTrackInJSON() {

		Country country = new Country();
		country.setName("Suriname");
		country.setCapital("Paramaribo");

		return country;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Country country) {

		String result = "Country saved : " + country;
		return Response.status(201).entity(result).build();
		
	}
	
}
