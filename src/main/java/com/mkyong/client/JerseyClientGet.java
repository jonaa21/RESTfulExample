package com.mkyong.client;

import com.mkyong.Country;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import java.util.List;

public class JerseyClientGet {

	public static void main(String[] args) {
		try {

			DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
			defaultClientConfig.getClasses().add(JacksonJsonProvider.class);
			Client client = Client.create(defaultClientConfig);

			WebResource webResource = client
//					.resource("http://localhost:9080/RESTfulExample/rest/json/countries/get");
					.resource("http://restcountries.eu/rest/v2/");
			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			List<Country> countries = response.getEntity(new GenericType<List<Country>>(){

			});

			System.out.println("Output from Server .... \n");
			countries.forEach(country -> System.out.println(country));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
