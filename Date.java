package nesne;

import java.util.Calendar;

public class Date {

	private int day;
	private int month;
	private int year;
	private Date today;
	
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isAfterThan(Date other) {
		if(other.year > this.year) {	
				return true;
			
		} else if(other.month > this.month) {
			
			return true;
			
		} else if(other.day > this.day) {
		
			return true;
			
		} else {
			
			return false;
			
		} 
	}
	
	public boolean isBeforeThan(Date other) {
		
		if(!isAfterThan(other)) {
			
			if(other.year == this.year) {
				
				if(other.month == this.month) {
					
					if(other.day == this.day) {
						
						return false;
					}
				}
			} 
		}
		
		return true;
		
	}
	
	public boolean isEqualsWith(Date other){
		
		if(!isAfterThan(other)) {
			
			if(!isBeforeThan(other)) {
				
				return true;
			}
		}
		return false;
	}
	
	public static Date getToday() {
		java.util.Date d = new java.util.Date();
		
		Date tmp = new Date(d.getDay(), d.getMonth(), d.getYear());
		return tmp;
		
	}
	
	
	
	
}
