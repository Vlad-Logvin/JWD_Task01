package by.epam.jwd.task1.distance;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DistanceTest {
	private double xA;
	private double yA;
	private double xB;
	private double yB;
	private int expectedValue;

	public DistanceTest(double xA, double yA, double xB, double yB, int expectedValue) {
		this.xA = xA;
		this.yA = yA;
		this.xB = xB;
		this.yB = yB;
		this.expectedValue = expectedValue;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{1, 1, 2, 2, 1},
			{2, 2, 1, 1, -1}, 
			{Double.NaN, 2, 3, 4, 2},
			{Double.POSITIVE_INFINITY, 1, Double.POSITIVE_INFINITY, 3, 2},
			{Double.POSITIVE_INFINITY, 3, 4, 5, -1},
			{Double.NEGATIVE_INFINITY, 4, 1, 2, -1},
			{4, 5, -5, -4, 0}
		});
	}
	
	@Test
	public void isACloserToBTest001() {
		Distance distance = new Distance();
		int realValue = distance.isACloserToB(xA, yA, xB, yB);
		
		Assert.assertEquals(expectedValue, realValue);
	}
}
