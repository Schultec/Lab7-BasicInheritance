package lab7.cscd211Inheritance;

import lab7.cscd211Comparator.ManufacturerComparator;

public class Engine implements Comparable<Engine>{
    // fields
    protected int horsePower;
    private String manufacturer;

    //constructors
    public Engine(){

    }
    public Engine(String manufacturer, int horsePower) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }
    public Engine(int horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    //methods
    public int calcOutput(){
        return this.horsePower / 5;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }

    //toString and compareTo
    @Override
    public int compareTo(Engine pi){
        if (Integer.valueOf(this.horsePower).compareTo(Integer.valueOf(pi.horsePower)) == 0){
            return this.manufacturer.compareTo(pi.manufacturer);
        }
        return Integer.valueOf(this.horsePower).compareTo(Integer.valueOf(pi.horsePower));
    }

    @Override
    public String toString() {
       return "Manufacturer: "+ this.getManufacturer() + " with HP of: " + this.horsePower;
    }
}
