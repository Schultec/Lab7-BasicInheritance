package lab7.cscd211Inheritance;

public class TruckEngine extends Engine {
    //fields
    private boolean diesel;

    // constructor
    public TruckEngine(String manufacturer, int horsepower, boolean diesel){
        super(manufacturer, horsepower);
        this.diesel = diesel;
    }

}
