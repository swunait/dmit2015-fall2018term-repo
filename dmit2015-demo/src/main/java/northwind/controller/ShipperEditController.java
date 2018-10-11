package northwind.controller;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Faces;
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
	
	@NotNull(message="Search value is required.")
	private Integer idQueryValue;		// +getter +setter
	
	public Integer getIdQueryValue() {
		return idQueryValue;
	}

	public void setIdQueryValue(Integer idQueryValue) {
		this.idQueryValue = idQueryValue;
	}

	public void findShipper() {
		try {
			existingShipper = currentNorthwindService.findOneShipper(idQueryValue);
			if (existingShipper != null) {
				Messages.addGlobalInfo("Query successful");
				
			} else {
				Messages.addGlobalError("Query unsuccessful");
				
			}
		} catch (Exception e) {
			Messages.addGlobalError("Query unsucessful");
			Messages.addGlobalError("{0}", e.getMessage());	
		}			
	}
	
	public String updateShipper() {
		String nextPage = null;
		try {
			currentNorthwindService.updateShipper(existingShipper);
			Messages.addGlobalInfo("Update successful");
			nextPage = "viewShippers?faces-redirect=true";
		} catch (Exception e) {
			Messages.addGlobalError("Update unsuccessful");	
			Messages.addGlobalError("{0}", e.getMessage());	
		}
		return nextPage;
	}

	public String deleteShipper() {
		String nextPage = null;
		try {
			currentNorthwindService.deleteShipper(existingShipper);
			existingShipper = null;
			idQueryValue = null;
			Messages.addGlobalInfo("Delete successful");
			nextPage = "viewShippers?faces-redirect=true";
		} catch (Exception e) {
			Messages.addGlobalInfo("Delete unsuccessful");
			Messages.addGlobalError("{0}", e.getMessage());			
		}
		return nextPage;
	}
	
	public void cancel() {
		existingShipper = null;
		idQueryValue = null;
	}
	
	public void findByQueryParameterId() {
		if (!Faces.isPostback() && !Faces.isValidationFailed() ) {
			if (idQueryValue != null && existingShipper == null) {
				findShipper();		
			}
		}
	}

}
