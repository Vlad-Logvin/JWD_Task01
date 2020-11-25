package by.epam.jwd.task1.circle;

public class Circle {
	public double getCircleLength(double R) {
		if (!isRadiusValid(R)) {
			return -1.0;
		}
		return 2 * Math.PI * R;
	}

	private boolean isRadiusValid(double R) {
		if (R < 0 || Double.isNaN(R)) {
			System.out.println("Radius is less than zero or not a number");
			return false;
		}
		return true;
	}

	public double getCircleSquare(double R) {
		if (!isRadiusValid(R)) {
			return -1.0;
		}
		return Math.PI * R * R;
	}
	
	public static void main(String[] arg) {
		System.out.println(Double.NEGATIVE_INFINITY < 0);
	}
}