package northwind.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import northwind.entity.Category;
import northwind.service.NorthwindService;

@Named
@ViewScoped
public class CategoryController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private NorthwindService currentNorthwindService;
	
	private List<Category> categories;	// +getter
	
	@PostConstruct
	public void init() {
		categories = currentNorthwindService.findAllCategory();
	}

	public List<Category> getCategories() {
		return categories;
	}
	
	
}
