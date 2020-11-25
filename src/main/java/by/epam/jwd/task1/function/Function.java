package by.epam.jwd.task1.function;

public class Function {
	public double function(double x) {
		return (x >= 3.0) ? (-x * x + 3 * x + 9) : 1 / (x * x * x - 6);
	}
}
