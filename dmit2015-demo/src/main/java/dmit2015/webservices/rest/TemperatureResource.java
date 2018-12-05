package dmit2015.webservices.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("temperature")
public class TemperatureResource {

	@GET
	@Path("fahrenheit/{celisus}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	@Consumes(MediaType.APPLICATION_JSON)
	public double celisusToFahrenheit(@PathParam("celisus") double celisusValue) {
		return (5.0/9.0) * (celisusValue - 32) ;
	}

	@GET
	@Path("celsius")
	@Produces("application/json")
	@Consumes("application/json")	
	public double fahrenheitToCelisus(@QueryParam("fahrenheint") double fahrenheintValue) {
		return (9.0/5.0) * fahrenheintValue + 32;
	}

}
