package by.epam.jwd.task1.circle;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value = Parameterized.class)
public class CircleTest {
	private double expectedLength;
	private double expectedSquare;
	private double radius;
	
	public CircleTest(double radius, double expectedLength, double expectedSquare) {
		this.radius = radius;
		this.expectedLength = expectedLength;
		this.expectedSquare = expectedSquare;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues() {
		return Arrays.asList(new Object[][] {
			{Double.NaN, -1.0, -1.0},
			{1/Math.PI, 2, 0.318309},
			{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
			{Double.NEGATIVE_INFINITY, -1.0, -1.0},
			{0, 0, 0},
			{Double.MAX_VALUE, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}
		});
	}
	
	@Test
	public void getCircleLengthTest001() {
		double realLength;
		Circle circle = new Circle();
		realLength = circle.getCircleLength(radius);
		
		Assert.assertEquals(expectedLength, realLength, 0.0001);
	}
	
	@Test
	public void getCircleSquareTest001() {
		double realSquare;
		Circle circle = new Circle();
		realSquare = circle.getCircleSquare(radius);
		
		Assert.assertEquals(expectedSquare, realSquare, 0.0001);	
	}
}
