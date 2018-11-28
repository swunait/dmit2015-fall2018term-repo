package ca.nait.dmit.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import dmit2015.soap.ShapeEndPoint;
import dmit2015.soap.ShapeXmlWebService;

@Named
@RequestScoped
public class CircleClientController {

	private ShapeEndPoint shapeEndPoint = new ShapeEndPoint();
	private ShapeXmlWebService webClient = shapeEndPoint.getShapePort();
	
	public void calculateArea() {
		Messages.addGlobalInfo("There area of a circle with a radius of {0} is {1}", radius, webClient.areaOfCircle(radius));
	}
	
	public void calculateCircumference() {
		Messages.addGlobalInfo("There circumference of a circle with a radius of {0} is {1}", radius, webClient.circumferenceOfCircle(radius));
	}
	
	public void calculateDiameter() {
		Messages.addGlobalInfo("There diameter of a circle with a radius of {0} is {1}", radius, webClient.diameterOfCiricle(radius));
	}
	
	private double radius = 5;	// +getter +setter
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
