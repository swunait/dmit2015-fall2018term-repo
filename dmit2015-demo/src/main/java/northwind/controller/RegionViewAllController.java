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

import northwind.entity.Region;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class RegionViewAllController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private NorthwindService currentNorthwindService;

	private List<Region> regions;		// +getter	

	@PostConstruct
	public void retreiveAllRegions() {
		regions = currentNorthwindService.findAllRegion();
	}
	
	@Produces
	@Named
	public List<Region> getRegions() {
		return regions;
	}
	
	public void onRegionListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Region shipper) {
		retreiveAllRegions();
	}
	
}
