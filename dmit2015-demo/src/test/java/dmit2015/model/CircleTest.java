package dmit2015.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testAllMethodss() {
		// Create a Circle object with a radius 5
		Circle circle1 = new Circle(5);
		// Verify the area is 78.54
		assertEquals(78.54, circle1.getArea(), 0.01);
		// Verify the diameter is 10
		assertEquals(10, circle1.getDiameter(), 0);
		// Verify the circumference is 31.42
		assertEquals(31.42, circle1.getCircumference(), 0.01);
	}

}
