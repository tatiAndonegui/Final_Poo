package sistemaGarage;

import vehiculos.Car;
import vehiculos.Motorcycle;
import vehiculos.Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        String nombreEquipoGanadorMundial = garage.getGanadorMundial();
        garage.setMaximunSizeOfTheGarage(5);

        Car auto1 = new Car();
        auto1.setBrand("toyota");
        auto1.setKilometers(500000);
        auto1.setTotalWheels(4);
        auto1.setNumberOfDoors(4);

        Car auto2 = new Car();
        auto2.setBrand("ford");
        auto1.setKilometers(400000);
        auto1.setTotalWheels(4);
        auto1.setNumberOfDoors(3);

        Car auto3 = new Car();
        auto2.setBrand("chevrolet");
        auto1.setKilometers(800000);
        auto1.setTotalWheels(4);
        auto1.setNumberOfDoors(3);

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
    }
}
