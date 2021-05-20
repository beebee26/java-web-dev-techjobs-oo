package org.launchcode.techjobs_oo;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return super.getValue();
    }

}
