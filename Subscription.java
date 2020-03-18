package nesne;

public class Subscription {
    private Date begin;
    private Date end;
    private SubscribedVehicle vehicle;

    public Subscription(Date begin, Date end, SubscribedVehicle vehicle){
        this.begin = begin;
        this.end = end;
        this.vehicle = vehicle;
    }

    public boolean isValid(){
       return this.begin.isAfterThan(this.end);
    }
}