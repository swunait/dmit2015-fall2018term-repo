package ca.nait.dmit.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

import dmit2015.model.Rectangle;

@Named
@ViewScoped
public class RectangleController implements Serializable {
	private static final long serialVersionUID = 1L;

	private Rectangle currentRectangle = new Rectangle();			// +getter
	private ArrayList<Rectangle> rectangles = new ArrayList<>();	// +getter
	private BarChartModel rectangleChartModel = new BarChartModel();	// +getter
	
	public void generateChart() {
		rectangleChartModel.clear();
		ChartSeries rectangleSeries = new ChartSeries();
		Random currentRandom = new Random();
		for(int count = 1; count <= 10; count++) {
			rectangleSeries.set(count, currentRandom.nextInt(100) + 1);
		}
		
		rectangleChartModel.addSeries(rectangleSeries);		
	}
	
	
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

	public BarChartModel getRectangleChartModel() {
		return rectangleChartModel;
	}

	
	
}
