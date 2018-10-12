package northwind.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import northwind.entity.Region;
import northwind.entity.Territory;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class TerritoryCreateController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Territory newTerritory;
	
	@NotNull(message="A Region must be selected")
	private Integer selectedRegionId;	// +getter +setter
	
	public Integer getSelectedRegionId() {
		return selectedRegionId;
	}

	public void setSelectedRegionId(Integer selectedRegionId) {
		this.selectedRegionId = selectedRegionId;
	}

	@PostConstruct
	public void initNewTerritory() {
		newTerritory = new Territory();
		selectedRegionId = null;
	}
	
	public void createNewTerritory() {
		try {
			if (selectedRegionId != null && selectedRegionId > 0) {
				Region selectedRegion = currentNorthwindService.findOneRegion(selectedRegionId);
				newTerritory.setRegion(selectedRegion);
			}
			currentNorthwindService.addTerritory(newTerritory);
			initNewTerritory();
			Messages.addGlobalInfo("Add successful");
		} catch (Exception e) {
			Messages.addGlobalError("Add unsuccessful");
			Messages.addGlobalError("{0}", e.getMessage());	
		}
	}
	
}
