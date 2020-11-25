package by.epam.jwd.task1.tg_function;

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
			{ 0.0, 0.0 },
			{ -Math.PI, 0.0 },
			{ Math.PI, 0.0 },
			{ 1.0, 1.55741 },
			{ -1.0, -1.55741 }
		});
	}

	@Test
	public void getFunctionAtPointTest001() {
		Function function = new Function();
		double realResult = function.getFunctionAtPoint(x);

		Assert.assertEquals(expectedResult, realResult, 0.001);
	}
}
