package dmit2015.client;

import static org.junit.Assert.*;

import org.junit.Test;

import dmit2015.soap.TemperatureConverter;
import dmit2015.soap.TemperatureConverterService;

public class TemperatureConverterTest {

	TemperatureConverterService temperatureService = new TemperatureConverterService();
	TemperatureConverter converter = temperatureService.getTemperatureConverterPort();

	@Test
	public void testFahrenheitToCelisus() {
		assertEquals(10,converter.fahrenheitToCelisus(50), 0);
	}

	@Test
	public void testCelisusToKelvin() {
		assertEquals(323.15,converter.celisusToKelvin(50), 0);
	}

	@Test
	public void testCelisusToFahrenheit() {
		assertEquals(122,converter.celisusToFahrenheit(50), 0);
	}

	@Test
	public void testKelvinToCelisus() {
		assertEquals(-223.15, converter.kelvinToCelisus(50), 0.001);
	}

	@Test
	public void testKelvinToFahrenheit() {
		assertEquals(-369.67,converter.kelvinToFahrenheit(50), 0.001);
	}

	@Test
	public void testFahrenheitToKelvin() {
		assertEquals(283.15,converter.fahrenheitToKelvin(50), 0);
	}
	
}
