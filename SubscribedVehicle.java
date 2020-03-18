package nesne;

public class SubscribedVehicle implements Vehicle {
	
	private String plate;
	private Subscription subscription;
	private boolean special;
	
    public SubscribedVehicle(String plate, Date begin, Date end){
        this.plate = plate;
        this.subscription = new Subscription(begin, end, this);
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