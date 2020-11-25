package by.epam.jwd.task1.square_area;

public class SquareArea {
	public double getSmallSquareArea(double bigSquareArea) {
		if (bigSquareArea > 0.0) {
			return bigSquareArea / 2.0;
		} else {
			System.out.println("Not correct area!");
			return -1;
		}
	}
}
