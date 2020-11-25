package by.epam.jwd.task1.even_numbers;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class EvenNumbersTest {
	private int a;
	private int b;
	private int c;
	private int d;
	private boolean expectedValue;

	public EvenNumbersTest(int a, int b, int c, int d, boolean expectedValue) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.expectedValue = expectedValue;
	}

	@Parameters
	public static Collection<Object[]> tableValues() {
		return Arrays.asList(new Object[][] { 
			{ 0, 0, 0, 0, true },
			{ Integer.MAX_VALUE, Integer.MIN_VALUE, 2, 3, true},
			{ -1, -3, -5, -7, false},
			{ 2, 4, 6, 8, true},
			{ 1, 2, 3, 4, true},
			{ -1, -2, -3, -4, true}
		});
	}
	
	@Test
	public void isExistTwoEvenNumbersTest001() {
		EvenNumbers evenNumbers = new EvenNumbers();
		boolean realValue = evenNumbers.isExistTwoEvenNumbers(a, b, c, d);
		
		Assert.assertEquals(expectedValue, realValue);
	}
	
}
