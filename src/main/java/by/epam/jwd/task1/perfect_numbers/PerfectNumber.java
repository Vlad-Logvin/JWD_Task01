package by.epam.jwd.task1.perfect_numbers;

public class PerfectNumber {

	public boolean isNumberPerfect(long number) {

		if (number > 0) {
			long temp = number;

			for (int i = 1; i <= (long) number / 2; i++) {
				if (number % i == 0) {
					temp -= i;
				}
			}
			return temp == 0;
		} else {
			return false;
		}

	}
}
