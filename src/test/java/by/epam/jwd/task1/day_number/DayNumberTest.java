package by.epam.jwd.task1.day_number;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DayNumberTest {
	private int year;
	private int month;
	private int expectedDays;
	
	public DayNumberTest(int year, int month, int expectedDays){
		this.year = year;
		this.month = month;
		this.expectedDays = expectedDays;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{-4, 12, -1},
			{2000, 16, -1},
			{2020, 2, 29},
			{2019, 11, 30},
			{2018, 3, 31},
			{2020, -4, -1},
			{2019, 2, 28}
		});
	}
	
	@Test
	public void dayNumberTest001() {
		DayNumber dayNumber = new DayNumber();
		int realDays = dayNumber.getDayNumber(year, month);
		
		Assert.assertEquals(expectedDays, realDays);
	}
}