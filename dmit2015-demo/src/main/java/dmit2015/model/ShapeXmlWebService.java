package dmit2015.model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
(serviceName="ShapeEndPoint",
			targetNamespace="http://localhost",
			portName="ShapePort")
public class ShapeXmlWebService {
	
	@WebMethod
	public double areaOfCircle(double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getArea();
	}
	
	public double diameterOfCiricle(double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getDiameter();
	}
	
	public double circumferenceOfCircle(double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getCircumference();

	}

}
