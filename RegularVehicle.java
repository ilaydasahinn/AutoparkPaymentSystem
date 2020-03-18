package nesne;

public class RegularVehicle implements Vehicle {
	
	private String plate;
	private Subscription subscription;
	private boolean special;
	
    public RegularVehicle(String plate){
        this.plate = plate;
        this.subscription = null;
        this.special = false;
    }

    public String getPlate(){
        return this.plate;
    }

    public Subscription getSubscription(){
        return this.subscription;
    } 

    public boolean isSpecial(){
        return this.special;
    }
}