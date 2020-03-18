package nesne;

public class OfficialVehicle implements Vehicle {
	
	private String plate;
	private Subscription subscription;
	private boolean special;
	
    public OfficialVehicle(String plate){
        this.plate = plate;
        this.subscription = null;
        this.special = true;
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