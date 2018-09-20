package ca.nait.dmit.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import dmit2015.model.Circle;

@Named
@RequestScoped
public class CircleController {

//	private double radius = 5;	// +getter +setter
	private Circle currentCircle = new Circle();	// +getter +setter
	
	public void calculateArea() {
//		Circle currentCircle = new Circle(radius);
		// Send a message to FacesContent with the area of the circle
		Messages.addGlobalInfo("This is a literal message");
		Messages.addGlobalInfo(
"There area of a circle with a radius of {0} is {1}",
currentCircle.getRadius(), currentCircle.getArea());
	}
	
	public void calculateCircumference() {
		Messages.addGlobalInfo(
"There circumference of a circle with a radius of {0} is {1}",
currentCircle.getRadius(), currentCircle.getCircumference());
	}
	
	public void calculateDiameter() {
		Messages.addGlobalInfo(
"There diameter of a circle with a radius of {0} is {1}",
currentCircle.getRadius(), currentCircle.getDiameter());
	}

	public Circle getCurrentCircle() {
		return currentCircle;
	}

	public void setCurrentCircle(Circle currentCircle) {
		this.currentCircle = currentCircle;
	}
	
	

//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
	
	
}
