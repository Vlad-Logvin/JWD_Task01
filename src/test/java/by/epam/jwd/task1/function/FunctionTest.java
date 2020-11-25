package by.epam.jwd.task1.function;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class FunctionTest {
	private double x;
	private double expectedResult;

	public FunctionTest(double x, double expectedResult) {
		this.x = x;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> tableValues() {
		return Arrays.asList(new Object[][] { 
			{Double.POSITIVE_INFINITY, Double.NaN}, 
			{Double.NEGATIVE_INFINITY, 0}, 
			{Double.NaN, Double.NaN},
			{3.0, 9.0},
			{2, 0.5},
			{Math.pow(6, 1.0/3.0), Double.POSITIVE_INFINITY}
		});
	}

	@Test
	public void functionTest001() {
		Function function = new Function();
		double realResult = function.function(x);

		Assert.assertEquals(expectedResult, realResult, 000001);
	}
}
