package northwind.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import northwind.entity.Shipper;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class ShipperCreateController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Shipper newShipper;
	
	@PostConstruct
	public void initNewShipper() {
		newShipper = new Shipper();
	}
	
	public void createNewShipper() {
		try {
			currentNorthwindService.addShipper(newShipper);
			initNewShipper();
			Messages.addGlobalInfo("Add successful");
		} catch (Exception e) {
			Messages.addGlobalError("Add unsuccessful");			
		}
	}
	
}
