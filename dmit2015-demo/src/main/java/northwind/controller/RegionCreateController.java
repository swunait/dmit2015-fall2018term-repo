package northwind.controller;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJBAccessException;
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
	private Logger logger;
	
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
		} catch(EJBAccessException e) {
			Messages.addGlobalError(e.getMessage());
		} catch (Exception e) {
			Messages.addGlobalError("Add unsuccessful");
			logger.log(Level.SEVERE, e.toString(), e);		
		}
	}
	
}
