package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {
//    De klasse heeft de volgende variabelen:
    private String ownerFirstName;
    private String ownerLastName;
    private int ageOwner;
//    De owner kan meerder auto's hebben waar we een lijst van maken.
    private List<Car> cars;
//    We maken de constructor aan:

    public CarOwner(String ownerFirstName, String ownerLastName, int ageOwner) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ageOwner = ageOwner;
//    Van de lijst van auto's maken we een arraylijst.
        cars = new ArrayList<>();
    }
//    Vervolgens maken we de setters en de getters:

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public int getAgeOwner() {
        return ageOwner;
    }

    public void setAgeOwner(int ageOwner) {
        this.ageOwner = ageOwner;
    }
//    Vervolgens gaan we de methodes aanmaken die acties gaan doen.
//    Voor de owner moeten we twee acties uitvoeren, auto's toevoegen aan de lijst en controleren op kenteken.
//    Eerst checken we of in de lijst dez auto al voorkomt door de kentekens te vergelijken.
    public boolean containsLicensePlate(Car car) {
//    We loopen over de lijst van auto's heen en controleren op het kenteken.
    for(Car ownedCar: cars) {
        if(ownedCar.getLicensePlate().equals(car.getLicensePlate())) {
            return true;
        }
    }
    return false;
}
//      Als het kenteken niet in de lijst voorkomt dan voegen we de auto toe aan de lijst.
    public boolean addCar(Car car) {
        if(!containsLicensePlate(car)) {
            cars.add(car);
            return true;
        }
        return false;
    }

}
