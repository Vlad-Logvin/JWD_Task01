package by.epam.jwd.task1.time;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public int getHours() {
		return this.hours;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public int getSeconds() {
		return this.seconds;
	}

	public void setTime(int seconds) {

		if (seconds >= 0) {
			
			this.hours = seconds / 3600;
			this.minutes = (seconds - this.hours * 3600) / 60;
			this.seconds = seconds - this.hours * 3600 - this.minutes * 60;

		} else {
			this.hours = -1;
			this.minutes = -1;
			this.seconds = -1;
		}
	}
}
