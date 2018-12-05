package northwind.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import northwind.entity.Shipper;

@Path("northwind-api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NorthwindResource {
	
	@Inject
	private NorthwindService northwindService;
	
	@POST
	@Path("shippers")
	public void createShipper(Shipper newShipper) {
		northwindService.addShipper(newShipper);
	}

	@GET
	@Path("shippers/{id}")
	public Shipper findOneShipper(@PathParam("id") int shipperId) {
		return northwindService.findOneShipper(shipperId);
	}

	@GET
	@Path("shippers")
	public List<Shipper> findAllShipper() {
		return northwindService.findAllShipper();
	}

	@PUT
	@Path("shippers")
	public void updateShipper(Shipper existingShipper) {
		northwindService.updateShipper(existingShipper);
	}
	
	@DELETE
	@Path("shippers/{id}")
	public void deleteShipper(@PathParam("id") int shipperId) throws Exception {
		Shipper existingShipper = northwindService.findOneShipper(shipperId);
		northwindService.deleteShipper(existingShipper);
	}
}
