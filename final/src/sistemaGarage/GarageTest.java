package sistemaGarage;

import vehiculos.Car;
import vehiculos.Motorcycle;
import vehiculos.Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        String nombreEquipoGanadorMundial = garage.getGanadorMundial();
        garage.setMaximunSizeOfTheGarage(5);
        garage.setWheelChangePrice(50);
        System.out.println("La cantidad maxima de vehiculos para el garage son " + garage.getMaximunSizeOfTheGarage());
        System.out.println("El precio por rueda es " + garage.getWheelChangePrice());

        Car auto1 = new Car();
        auto1.setBrand("toyota");
        auto1.setKilometers(500000);
        auto1.setTotalWheels(4);
        auto1.setNumberOfDoors(4);

        Car auto2 = new Car();
        auto2.setBrand("ford");
        auto2.setKilometers(400000);
        auto2.setTotalWheels(4);
        auto2.setNumberOfDoors(3);

        Car auto3 = new Car();
        auto3.setBrand("chevrolet");
        auto3.setKilometers(800000);
        auto3.setTotalWheels(4);
        auto3.setNumberOfDoors(3);

        Motorcycle moto1 = new Motorcycle();
        moto1.setBrand("yamaha");
        moto1.setKilometers(20000);
        moto1.setTotalWheels(2);
        moto1.setDisplacement("250 cc");

        Motorcycle moto2 = new Motorcycle();
        moto2.setBrand("honda");
        moto2.setKilometers(60000);
        moto2.setTotalWheels(2);
        moto2.setDisplacement("125 cc");

        Motorcycle moto3 = new Motorcycle();
        moto3.setBrand("ducati");
        moto3.setKilometers(20000);
        moto3.setTotalWheels(2);
        moto3.setDisplacement("500 cc");

        garage.vehicleEntry(moto1);
        garage.vehicleEntry(moto2);
        garage.vehicleEntry(auto1);

        System.out.println("El kilometraje medio es " + garage.getAverageKilometers());

        System.out.println("El precio de cambiar las ruedas del vehiculo " + moto1 +" es " + garage.getTotalPrice(moto1));

        System.out.println("La cantidad de vehiculos actuales es " + garage.getCurrentAumountOfVehicles());

        garage.vehicleEntry(moto3);
        garage.vehicleEntry(auto2);
        garage.vehicleEntry(auto3);

        garage.vehicleExit(moto1, nombreEquipoGanadorMundial);
        garage.vehicleExit(moto2, nombreEquipoGanadorMundial);

    }
}
