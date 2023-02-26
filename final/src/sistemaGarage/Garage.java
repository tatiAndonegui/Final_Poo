package sistemaGarage;
import vehiculos.Vehicles;
import java.util.ArrayList;

public class Garage {
    private int maximunSizeOfTheGarage;
    private int currentAumountOfVehicles;
    private double wheelChangePrice;
    private ArrayList<Vehicles> vehicles;

    public void vehicleEntry(Vehicles vehicle){
        if (currentAumountOfVehicles == maximunSizeOfTheGarage){
            System.out.println("El garage esta lleno");
        } else {
            this.vehicles.add(vehicle);
            currentAumountOfVehicles = currentAumountOfVehicles + 1;
        }

    }
    public void vehicleExit(Vehicles vehicle){
        if (currentAumountOfVehicles == 0){
            System.out.println("El garage esta vacio");
        } else {
            this.vehicles.remove(vehicle);
            currentAumountOfVehicles = currentAumountOfVehicles - 1;
            //aca va el sorteo del mundial cuando retira vehiculo
        }
    }
    public void setWheelChangePrice(double wheelChangePrice) {
        this.wheelChangePrice = wheelChangePrice;
    }
    public double getWheelChangePrice() {
        return wheelChangePrice;
    }

    public void setMaximunSizeOfTheGarage(int maximunSizeOfTheGarage) {
        this.maximunSizeOfTheGarage = maximunSizeOfTheGarage;
    }
    public int getMaximunSizeOfTheGarage() {
        return maximunSizeOfTheGarage;
    }


    public int getCurrentAumountOfVehicles() {
        return currentAumountOfVehicles;
    }

    public double getTotalPrice(Vehicles vehicle){
        return vehicle.getTotalWheels() * wheelChangePrice;
    }

    public double getAverageKilometers(ArrayList<Vehicles> vehicles){
        double kilometerTotal =0;
        for (int i = 0; i < vehicles.size(); i++) {
            kilometerTotal = kilometerTotal + vehicles.get(i).getKilometers();
        }
        return kilometerTotal /vehicles.size();
    }
}
