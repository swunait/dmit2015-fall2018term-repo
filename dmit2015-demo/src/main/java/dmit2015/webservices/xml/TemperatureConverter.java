package dmit2015.webservices.xml;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService()
public class TemperatureConverter {
	
	public @WebResult(name="fahrenheitValue") double celisusToFahrenheit(@WebParam(name="celisusValue") double celisusValue) {
		return (9.0/5.0) * celisusValue + 32;
	}

	public @WebResult(name="kelvinValue") double celisusToKelvin(@WebParam(name="celisusValue") double celisusValue) {
		return celisusValue + 273.15;
	}
	
	public @WebResult(name="celsiusValue") double fahrenheitToCelisus(@WebParam(name="fahrenheintValue") double fahrenheintValue) {
		return (5.0/9.0) * (fahrenheintValue - 32) ;
	}

	public @WebResult(name="kelvinValue") double fahrenheitToKelvin(@WebParam(name="fahrenheintValue") double fahrenheintValue) {
		return (5.0/9.0) * (fahrenheintValue - 32) + 273.15;
	}

	public @WebResult(name="celsiusValue") double kelvinToCelisus(@WebParam(name="kelvinValue") double kelvinValue) {
		return kelvinValue - 273.15;
	}

	public @WebResult(name="fahrenheitValue") double kelvinToFahrenheit(@WebParam(name="kelvinValue") double kelvinValue) {
		return (9.0/5.0) * (kelvinValue - 273.15) + 32;
	}

}
