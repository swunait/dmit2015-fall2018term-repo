package northwind.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import northwind.entity.Territory;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class TerritoryViewAllController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private NorthwindService currentNorthwindService;

	private List<Territory> territories;		// +getter	

	@PostConstruct
	public void retreiveAllTerritorys() {
		territories = currentNorthwindService.findAllTerritory();
	}
	
	@Produces
	@Named
	public List<Territory> getTerritories() {
		return territories;
	}
	
	
}
