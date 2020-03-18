package nesne;


public class ParkRecord {

	private Time enterTime;
	private Time exitTime;
	private Vehicle vehicle;
	
	public ParkRecord(Time enterTime, Vehicle vehicle) {
		 this.enterTime = enterTime;
		 this.vehicle = vehicle;
	}
	
	public int getParkingDuration() {
		int x = exitTime.getHour() - enterTime.getHour();
		int y = exitTime.getMinute() - enterTime.getMinute();
		return 60*x+y;
	}
	
	public void setExitTime(Time exit) {
		this.exitTime = exit;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
}
