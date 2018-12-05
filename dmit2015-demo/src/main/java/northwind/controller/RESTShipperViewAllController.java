package northwind.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import northwind.entity.Shipper;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class RESTShipperViewAllController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	final static String BASE_URI = "http://localhost:8080/dmit2015-fall2018term-demo/rest/northwind-api/shippers";
	
	private List<Shipper> shippers;		// +getter	

	@PostConstruct
	public void retreiveAllShippers() {
		Client restClient = ClientBuilder.newClient();
		Response response = restClient.target(BASE_URI).request().get();
		if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
			shippers = response.readEntity(new GenericType<List<Shipper>>() {});
		} 
	}
	
	@Produces
	@Named
	public List<Shipper> getShippers() {
		return shippers;
	}
	
}
