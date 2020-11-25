package by.epam.jwd.task1.perfect_numbers;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PerfectNumberTest {
	
	private long number;
	private boolean expectedValue;
	
	public PerfectNumberTest(long number, boolean expectedValue) {
		this.number = number;
		this.expectedValue = expectedValue;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{Long.MIN_VALUE, false},
			{999999, false},
			{-6, false},
			{0, false},
			{1, false},
			{6, true},
			{28, true},
			{496, true}
		});
	}
	
	@Test
	public void isNumberPerfectTest001() {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean realValue = perfectNumber.isNumberPerfect(number);
		
		Assert.assertEquals(expectedValue, realValue);
	}
}
