package by.epam.jwd.task1.tg_function;

public class Function {

	public double getFunctionAtPoint(double x) {
		return Math.tan(x);
	}

	public void function(double a, double b, double h) {
		System.out.println("y = tg(x)\n");
		while (b > a) {
			System.out.println("x = " + a + " => y = " + getFunctionAtPoint(a));
			a += h;
		}
	}

	public static void main(String[] args) {
		Function function = new Function();
		function.function(0, 2 * Math.PI, Math.PI / 8);
	}
}
