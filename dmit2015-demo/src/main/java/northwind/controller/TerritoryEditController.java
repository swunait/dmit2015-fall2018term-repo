package northwind.controller;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJBAccessException;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import northwind.entity.Region;
import northwind.entity.Territory;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class TerritoryEditController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Logger logger;
	
	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Territory existingTerritory;
	
	@NotBlank(message="Search value is required.")
	private String idQueryValue;		// +getter +setter
	
	@NotNull(message="A Region must be selected")
	private Integer selectedRegionId;	// +getter +setter
	
	public Integer getSelectedRegionId() {
		return selectedRegionId;
	}
	public void setSelectedRegionId(Integer selectedRegionId) {
		this.selectedRegionId = selectedRegionId;
	}
	public String getIdQueryValue() {
		return idQueryValue;
	}
	public void setIdQueryValue(String idQueryValue) {
		this.idQueryValue = idQueryValue;
	}

	public void findTerritory() {
		try {
			existingTerritory = currentNorthwindService.findOneTerritory(idQueryValue);
			if (existingTerritory != null) {
				selectedRegionId = existingTerritory.getRegion().getRegionID();
				Messages.addGlobalInfo("Query successful");
				
			} else {
				Messages.addGlobalError("Query unsuccessful");
				
			}
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());	
		} catch (Exception e) {
			Messages.addGlobalError("Query unsucessful");			
		}
	}
	
	public void updateTerritory() {
		try {
			if (selectedRegionId != null && selectedRegionId > 0) {
				Region selectedRegion = currentNorthwindService.findOneRegion(selectedRegionId);
				existingTerritory.setRegion(selectedRegion);
			}
			currentNorthwindService.updateTerritory(existingTerritory);
			Messages.addGlobalInfo("Update successful");
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());	
		} catch (Exception e) {
			Messages.addGlobalError("Update unsuccessful");	
			logger.log(Level.SEVERE, e.toString(), e);		
		}
	}

	public void deleteTerritory() {
		try {
			if (selectedRegionId != null && selectedRegionId > 0) {
				Region selectedRegion = currentNorthwindService.findOneRegion(selectedRegionId);
				existingTerritory.setRegion(selectedRegion);
			}
			currentNorthwindService.deleteTerritory(existingTerritory);
			existingTerritory = null;
			idQueryValue = null;
			selectedRegionId = null;
			Messages.addGlobalInfo("Delete successful");
		} catch (Exception e) {
			Messages.addGlobalError("Delete unsuccessful");
			logger.log(Level.SEVERE, e.toString(), e);	
		}
	}
	
	public void cancel() {
		existingTerritory = null;
		idQueryValue = null;
	}
	
	public void findByQueryParameterId() {
		if (!Faces.isPostback() && !Faces.isValidationFailed() ) {
			if (idQueryValue != null && existingTerritory == null) {
				findTerritory();		
			}
		}
	}
	
}
