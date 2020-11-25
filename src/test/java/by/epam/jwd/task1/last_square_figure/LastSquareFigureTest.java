package by.epam.jwd.task1.last_square_figure;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class LastSquareFigureTest {
	
	private int number;
	private int expectedFigure;
	
	public LastSquareFigureTest(int number, int expectedFigure) {
		this.number = number;
		this.expectedFigure = expectedFigure;
	}
	
	@Parameters
	public static Collection<Object[]> tableValues(){
		return Arrays.asList(new Object[][] {
			{Integer.MIN_VALUE, 4},
			{Integer.MAX_VALUE, 9},
			{0, 0},
			{32, 4},
			{-96, 6}
		});		
	}
	
	@Test
	public void findLastSquareFigureTest001() {
		LastSquareFigure lastSquareFigure = new LastSquareFigure();
		int realFigure = lastSquareFigure.findLastSquareFigure(number);

		Assert.assertEquals(realFigure, expectedFigure);
	}
}