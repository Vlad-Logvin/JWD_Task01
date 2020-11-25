package by.epam.jwd.task1.last_square_figure;


public class LastSquareFigure {

	public int findLastSquareFigure(int number) {
		int lastFigure = number % 10;
		return (lastFigure * lastFigure) % 10;
	}
}
