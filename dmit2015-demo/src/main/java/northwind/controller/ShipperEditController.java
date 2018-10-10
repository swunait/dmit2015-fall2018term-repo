package northwind.controller;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import northwind.entity.Shipper;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class ShipperEditController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Shipper existingShipper;
	
	private Integer shipperIdQueryValue;		// +getter +setter
	
	public Integer getShipperIdQueryValue() {
		return shipperIdQueryValue;
	}

	public void setShipperIdQueryValue(Integer shipperIdQueryValue) {
		this.shipperIdQueryValue = shipperIdQueryValue;
	}

	public void findShipper() {
		try {
			existingShipper = currentNorthwindService.findOneShipper(shipperIdQueryValue);
			if (existingShipper != null) {
				Messages.addGlobalInfo("Query successful");
				
			} else {
				Messages.addGlobalError("Query unsuccessful");
				
			}
		} catch (Exception e) {
			Messages.addGlobalError("Query unsucessful");			
		}
	}
	
	public void updateShipper() {
		try {
			currentNorthwindService.updateShipper(existingShipper);
			Messages.addGlobalInfo("Update successful");
		} catch (Exception e) {
			Messages.addGlobalError("Update unsuccessful");			
		}
	}

	public void deleteShipper() {
		try {
			currentNorthwindService.deleteShipper(existingShipper);
			existingShipper = null;
			shipperIdQueryValue = null;
			Messages.addGlobalInfo("Delete successful");
		} catch (Exception e) {
			Messages.addGlobalError("Delete unsuccessful");			
		}
	}
	
	public void cancel() {
		existingShipper = null;
	}

}
