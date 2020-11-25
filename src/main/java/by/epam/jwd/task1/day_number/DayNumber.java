package by.epam.jwd.task1.day_number;

public class DayNumber {

	public int getDayNumber(int year, int month) {
		if (year < 0 || month > 12 || month < 1) {
			System.out.println("Not correct month or year!");
			return -1;
		}
		
		int days = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
			
		case 2:
			if(year%4==0) {
				days = 29;
				break;
			}
			else {
				days = 28;
				break;
			}
		}
		
		return days;
	}

}
