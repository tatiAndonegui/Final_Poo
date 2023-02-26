package vehiculos;

import sistemaGarage.Garage;

public class Car extends Vehicles {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "auto [brand= " + super.getBrand() + " kilometers= " + super.getKilometers() +" total wheels= " + super.getTotalWheels() + " numberofdoors= " + this.numberOfDoors +"]";
    }
}
