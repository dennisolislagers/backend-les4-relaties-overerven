package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {
//    Car heeft de volgende variabelen:
    private String licensePlate;
    private String brand;
    private String type;
    private int drivenKilometers;

//    De constructor wordt aangemaakt:
    public Car(String licensePlate, String brand, String type, int drivenKilometers) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.type = type;
        this.drivenKilometers = drivenKilometers;
    }
//    De setters en de getters:

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDrivenKilometers() {
        return drivenKilometers;
    }

    public void setDrivenKilometers(int drivenKilometers) {
        this.drivenKilometers = drivenKilometers;
    }
}
