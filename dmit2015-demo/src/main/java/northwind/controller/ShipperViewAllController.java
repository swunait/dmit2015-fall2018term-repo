package northwind.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import northwind.entity.Shipper;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class ShipperViewAllController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private NorthwindService currentNorthwindService;

	private List<Shipper> shippers;		// +getter	

	@PostConstruct
	public void retreiveAllShippers() {
		shippers = currentNorthwindService.findAllShipper();
	}
	
	@Produces
	@Named
	public List<Shipper> getShippers() {
		return shippers;
	}
	
//	public void onShipperListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Shipper shipper) {
//		retreiveAllShippers();
//	}
}
