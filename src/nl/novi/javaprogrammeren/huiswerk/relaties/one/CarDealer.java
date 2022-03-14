package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
//     De klasse heeft de volgende variabelen:
    private String nameOfDealer;
    private String adress;
    private int yearsOfExperience;
//    De dealer kan meerdere auto's hebben:
    private List<Car>cars;
//    We maken de constructor aan:

    public CarDealer(String nameOfDealer, String adress, int yearsOfExperience) {
        this.nameOfDealer = nameOfDealer;
        this.adress = adress;
        this.yearsOfExperience = yearsOfExperience;
        cars = new ArrayList<>();
    }
//    Vervolgens maken we de setters en de getters.

    public String getNameOfDealer() {
        return nameOfDealer;
    }

    public void setNameOfDealer(String nameOfDealer) {
        this.nameOfDealer = nameOfDealer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
//    Nu gaan we de methodes maken die de auto's gaan overschrijven naar de owner:
//    We controleren bovendien of de auto op basis van het kenteken wel in de lijst voorkomt.
public void transferCarToOwner(Car car, CarOwner carOwner) {
    if(carOwner.getAgeOwner() > 18 && carOwner.addCar(car)) {
        this.removeCar(car);
    }

}
    public void removeCar(Car car) {
        if(containsLicensePlate(car)) {
            cars.remove(car);
        }
    }

//    We gaan de methodes aan de klasse toevoegen die zowel in deze klasse als in Owner klasse staan, dit zijn de bidirectionele methodes.
//    De acties die de methodes uitvoeren hebben effect op beide klasses.
    public boolean addCar(Car car) {
        if(!containsLicensePlate(car)) {
            cars.add(car);
            return true;
        }
        return false;
    }
    public boolean containsLicensePlate(Car car) {
        for (Car ownedCar : cars) {
            if (ownedCar.getLicensePlate().equals(car.getLicensePlate())) {
                return true;
            }
        }
        return false;
    }
    }
