package northwind.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import northwind.entity.Region;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class RegionCreateController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private NorthwindService currentNorthwindService;

	@Produces
	@Named
	private Region newRegion;
	
	@PostConstruct
	public void initNewRegion() {
		newRegion = new Region();
	}
	
	public void createNewRegion() {
		try {
			currentNorthwindService.addRegion(newRegion);
			initNewRegion();
			Messages.addGlobalInfo("Add successful");
		} catch (Exception e) {
			Messages.addGlobalError("Add unsuccessful");
			Messages.addGlobalError("{0}", e.getMessage());	
		}
	}
	
}
