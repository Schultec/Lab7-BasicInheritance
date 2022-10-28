package lab7.cscd211Comparator;

import lab7.cscd211Inheritance.Engine;

import java.util.Comparator;

public class ManufacturerComparator implements Comparator<Engine> {
    public int compare(Engine e1, Engine e2) {
        return e1.getManufacturer().compareTo(e2.getManufacturer());
    }
}
