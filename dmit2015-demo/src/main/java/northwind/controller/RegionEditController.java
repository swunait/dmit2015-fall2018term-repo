package northwind.controller;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJBAccessException;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import northwind.entity.Region;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class RegionEditController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Logger logger;
	
	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Region existingRegion;
	
	@NotNull(message="Search value is required.")
	private Integer idQueryValue;		// +getter +setter
	
	public Integer getIdQueryValue() {
		return idQueryValue;
	}

	public void setIdQueryValue(Integer idQueryValue) {
		this.idQueryValue = idQueryValue;
	}

	public void findRegion() {
		try {
			existingRegion = currentNorthwindService.findOneRegion(idQueryValue);
			if (existingRegion != null) {
				Messages.addGlobalInfo("Query successful");
				
			} else {
				Messages.addGlobalError("Query unsuccessful");
				
			}
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());	
		} catch (Exception e) {
			Messages.addGlobalError("Query unsucessful");
			logger.log(Level.SEVERE, e.toString(), e);		
		}
	}
	
	public void updateRegion() {
		try {
			currentNorthwindService.updateRegion(existingRegion);
			Messages.addGlobalInfo("Update successful");
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());
		} catch (Exception e) {
			Messages.addGlobalError("Update unsuccessful");	
			logger.log(Level.SEVERE, e.toString(), e);	
		}
	}

	public void deleteRegion() {
		try {
			currentNorthwindService.deleteRegion(existingRegion);
			existingRegion = null;
			idQueryValue = null;
			Messages.addGlobalInfo("Delete successful");
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());
		} catch (Exception e) {
			Messages.addGlobalError("Delete unsuccessful");			
			logger.log(Level.SEVERE, e.toString(), e);	
		}
	}
	
	public void cancel() {
		existingRegion = null;
		idQueryValue = null;
	}

	public void findByQueryParameterId() {
		if (!Faces.isPostback() && !Faces.isValidationFailed() ) {
			if (idQueryValue != null && existingRegion == null) {
				findRegion();		
			}
		}
	}
}
