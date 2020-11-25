package by.epam.jwd.task1.time;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TimeTest {
	private int expectedHours;
	private int expectedMinutes;
	private int expectedSeconds;
	private int seconds;
	
	public TimeTest(int seconds, int expectedHours, int expectedMinutes, int expectedSeconds) {
		this.seconds = seconds;
		this.expectedHours = expectedHours;
		this.expectedMinutes = expectedMinutes;
		this.expectedSeconds = expectedSeconds;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{-555, -1, -1, -1},
			{3665, 1, 1, 5},
			{Integer.MAX_VALUE, 596523, 14, 7},
			{Integer.MIN_VALUE, -1, -1, -1},
			{0, 0, 0, 0}
		});
	}
	
	@Test
	public void setTimeTest001() {
		Time time = new Time();
		time.setTime(seconds);
		int realHours = time.getHours();
		int realMinutes = time.getMinutes();
		int realSeconds = time.getSeconds();
		
		Assert.assertEquals(expectedHours, realHours);
		Assert.assertEquals(expectedMinutes, realMinutes);
		Assert.assertEquals(expectedSeconds, realSeconds);
	}
}
