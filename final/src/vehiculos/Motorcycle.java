package vehiculos;

import sistemaGarage.Garage;

public class Motorcycle extends Vehicles {
    private String displacement;

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "moto [brand= " + super.getBrand() + " kilometers= " + super.getKilometers() +" total wheels= " + super.getTotalWheels() + " displacement= " + this.displacement +"]";
    }
}
