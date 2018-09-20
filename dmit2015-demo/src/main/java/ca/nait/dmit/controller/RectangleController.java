package ca.nait.dmit.controller;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dmit2015.model.Rectangle;

@Named
@ViewScoped
public class RectangleController implements Serializable {
	private static final long serialVersionUID = 1L;

	private Rectangle currentRectangle = new Rectangle();			// +getter
	private ArrayList<Rectangle> rectangles = new ArrayList<>();	// +getter
	
	public void addRectangle() {
		// add the currentRectangle to the rectangles list
		rectangles.add(currentRectangle);
		// create another Rectangle to add
		currentRectangle = new Rectangle();
	}

	public Rectangle getCurrentRectangle() {
		return currentRectangle;
	}

	public void setCurrentRectangle(Rectangle currentRectangle) {
		this.currentRectangle = currentRectangle;
	}

	public ArrayList<Rectangle> getRectangles() {
		return rectangles;
	}

	
}
