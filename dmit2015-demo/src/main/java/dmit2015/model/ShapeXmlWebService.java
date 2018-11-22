package dmit2015.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
(serviceName="ShapeEndPoint",
			targetNamespace="http://localhost/",
			portName="ShapePort")
public class ShapeXmlWebService {
	
	@WebMethod
	public double areaOfCircle(double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getArea();
	}
	
	@WebResult(name="diameter")
	public double diameterOfCiricle(@WebParam(name="radius") double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getDiameter();
	}
	
	@WebResult(name="circumference")
	public double  circumferenceOfCircle(@WebParam(name="radius") double radius) {
		Circle currentCircle = new Circle(radius);
		return currentCircle.getCircumference();

	}

}
