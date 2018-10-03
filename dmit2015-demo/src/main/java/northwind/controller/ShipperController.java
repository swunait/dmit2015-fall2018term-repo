package northwind.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import northwind.entity.Shipper;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class ShipperController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private NorthwindService currentNorthwindService;

	private List<Shipper> shippers;		// +getter	

	@PostConstruct
	public void init() {
		shippers = currentNorthwindService.findAllShipper();
	}
	
	public List<Shipper> getShippers() {
		return shippers;
	}
	
	
}
