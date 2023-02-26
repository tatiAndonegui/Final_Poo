package vehiculos;

public class Vehicles {
    private String brand;
    private int kilometers;
    private int totalWheels;


    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getKilometers() {
        return kilometers;
    }
    public void setTotalWheels(int totalWheels) {
        this.totalWheels = totalWheels;
    }

    public int getTotalWheels() {
        return totalWheels;
    }

}
