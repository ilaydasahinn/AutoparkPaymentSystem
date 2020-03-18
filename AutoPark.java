package nesne;

import java.util.ArrayList;
import java.util.List;

public class AutoPark {
    private ArrayList<SubscribedVehicle> subscribedVehicles;
    private ArrayList<Vehicle> vehicleArray;
    private ArrayList<ParkRecord> parkRecords;
    private int capacity;
    private double hourlyFee;
    private double incomeDaily = 0;

    public AutoPark(int capacity, double hourlyFee){
        this.capacity = capacity;
        this.hourlyFee = hourlyFee;

        subscribedVehicles = new ArrayList<SubscribedVehicle>();
        vehicleArray = new ArrayList<Vehicle>();
        parkRecords = new ArrayList<ParkRecord>();
    }

    public SubscribedVehicle searchVehicle(String plate){
        for (SubscribedVehicle vehicle : subscribedVehicles) 
        { 
            if(vehicle.getPlate() == plate){
                return vehicle;
            }
        }
        return null;
    }

    public boolean isParked(String plate){
        for(Vehicle vehicle : vehicleArray){
            if(plate == vehicle.getPlate()){
                return true;
            }
        }
        return false;
    }

    public void enlargeVehicleArray(int extraCapacity){
        capacity = capacity + extraCapacity;
    }

    public boolean addVehicle(SubscribedVehicle vehicle){
        if(searchVehicle(vehicle.getPlate()) == null){
            subscribedVehicles.add(vehicle);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean vehicleEnters(String plate, Time enter, boolean isOfficial){
        SubscribedVehicle subVehicle = searchVehicle(plate);
        if(subVehicle == null){
            if(isOfficial == true){
                OfficialVehicle vehicle = new OfficialVehicle(plate);
                vehicleArray.add(vehicle);
                ParkRecord pr = new ParkRecord(enter, vehicle);
                parkRecords.add(pr);
            }
            else {
                RegularVehicle vehicle = new RegularVehicle(plate);
                vehicleArray.add(vehicle);
                ParkRecord pr = new ParkRecord(enter, vehicle);
                parkRecords.add(pr);
            }
        }
        else  {
            vehicleArray.add(subVehicle);
            ParkRecord pr = new ParkRecord(enter, subVehicle);
            parkRecords.add(pr);
        }
        return true;
    }

    public ParkRecord findRecord(String plate) {
    	for(ParkRecord pr : parkRecords) {
    		if(plate.equals(pr.getVehicle().getPlate())) {
    			return pr;
    		}
    	}
    	return null;
    }
    
    public Vehicle findVehicle(String plate){
        for(Vehicle vehicle : vehicleArray){
            if( plate.equals(vehicle.getPlate()) ){
                return vehicle;
            }
        }
        return null;
    }

    public boolean vehicleExits(String plate, Time exitTime){
        Vehicle vehicle = findVehicle(plate);
        if(vehicle != null) {
	        if(vehicle.getSubscription() != null && vehicle.getSubscription().isValid() == true ){
	        }
	        else if (vehicle.isSpecial() == true){
	        }
	        else {
	        	ParkRecord pr = findRecord(vehicle.getPlate());
	        	pr.setExitTime(exitTime);
	        	incomeDaily += pr.getParkingDuration() * hourlyFee;
	        }
	        vehicleArray.remove(vehicle);
        }
        
        return true;
    }

   @Override
    public String toString(){
	   	String tmp = "";

        tmp += "Subscribed Vehicles: \n";
        int i = 1;
        for(SubscribedVehicle vehicle : subscribedVehicles){
        	tmp += 1 + "\n";
            tmp += "Plate: " + vehicle.getPlate() + "\n";
            tmp += "Subscription valid: " + vehicle.getSubscription().isValid() + "\n";
            i++;
        }
        
        return tmp;
    }
   
   public String showParkInfo() {
	   String tmp = "\n\n";
       tmp += "Capacity: "+ this.capacity + "\n";
       
       tmp += "\n----All vehicles in autopark----\n";
       int i = 1;
       for(Vehicle vehicle : vehicleArray) {
    	   tmp += i +"- " + vehicle.getPlate() + "\n";
    	   tmp += vehicle.isSpecial() + "\n\n";
    	   i++;
       }
	   return tmp;
   }
   
   public double getIncome() {
	   return this.incomeDaily;
   }
}
