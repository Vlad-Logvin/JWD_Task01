package by.epam.jwd.task1.square_area;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SquareAreaTest {
	private double bigSquareArea;
	private double expectedSmallSquareArea;

	public SquareAreaTest(double bigSquareArea, double expectedSmallSquareArea) {
		this.bigSquareArea = bigSquareArea;
		this.expectedSmallSquareArea = expectedSmallSquareArea;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{5, 2.5},
			{2.6, 1.3},
			{-1, -1},
			{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
			{Double.NEGATIVE_INFINITY, -1},
			{Double.NaN, -1},
			{0, -1}
		});
	}
	
	@Test
	public void getSmallSquareAreaTest001() {
		SquareArea squareArea = new SquareArea();
		double realSmallSquareArea = squareArea.getSmallSquareArea(bigSquareArea);
		
		Assert.assertEquals(expectedSmallSquareArea, realSmallSquareArea, 0.0000000001);
	}
}
