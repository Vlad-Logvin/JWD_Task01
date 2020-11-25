package by.epam.jwd.task1.distance;

public class Distance {
	public int isACloserToB(double xA, double yA, double xB, double yB) {
		if (Double.isNaN(xA)
				|| Double.isNaN(xB)
				|| Double.isNaN(yA)
				|| Double.isNaN(yB)
				|| ((xA * xA + yA * yA) == Double.POSITIVE_INFINITY && (xB * xB + yB * yB) == Double.POSITIVE_INFINITY)) {
			return 2;
		}
		if ((xA * xA + yA * yA) == (xB * xB + yB * yB)) {
			return 0;
		} else if ((xA * xA + yA * yA) < (xB * xB + yB * yB)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Double.NaN==Double.NaN);
	}
}
