package nesne;


public class Time {

	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getDifference(Time other){
		
		return (other.hour-this.hour)*60 + (other.minute-this.minute);
		
	}
}
