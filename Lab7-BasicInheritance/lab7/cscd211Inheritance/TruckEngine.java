package lab7.cscd211Inheritance;

public class TruckEngine extends Engine implements Comparable<Engine>{
    //fields
    private boolean diesel;

    // constructor
    public TruckEngine(String manufacturer, int horsepower, boolean diesel){
        super(manufacturer, horsepower);
        this.diesel = diesel;
    }

    //methods
    @Override
    public int calcOutput() {
        if (diesel) {
            return super.calcOutput() / 18;
        }
        return super.calcOutput() / 8;
    }

    @Override
    public String toString() {
        if (diesel) {
            return "Truck Engine - Manufacturer " + this.getManufacturer() + " with HP of " + this.horsePower + " output of " + this.calcOutput() +  " and the engine is a diesel";
        }
        return "Truck Engine - Manufacturer " + this.getManufacturer() + " with HP of " + this.horsePower + " output of " + this.calcOutput() + " and the engine is NOT a diesel";
    }

}
