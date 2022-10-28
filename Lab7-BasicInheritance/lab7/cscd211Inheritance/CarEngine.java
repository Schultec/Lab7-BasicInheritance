package lab7.cscd211Inheritance;

public class CarEngine extends Engine implements Comparable<Engine>{

    // constructors
    public CarEngine(String manufacturer, int horsepower ){
        super(manufacturer, horsepower);
    }
    public CarEngine(int horsepower, String manufacturer){
        super(horsepower, manufacturer);
    }

    //methods
    @Override
    public int calcOutput() {
        return super.calcOutput() / 12;
    }

    //toString

    @Override
    public String toString() {
        return "Manufacturer: "+ this.getManufacturer() + " with HP of: " + this.horsePower;
    }
}
