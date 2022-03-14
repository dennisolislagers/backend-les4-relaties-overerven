package nl.novi.javaprogrammeren.huiswerk.inheritance;
//  We maken de abstracte subklasse Pet aan die hoort bij de superklasse Animal.
//  Vervolgens gaan we de klasse 'vullen' met subklasses die bij de klasse Pet horen.
public abstract class Pet extends Animal {
//    Alle objecten van de subklasse Pet hebben het volgende gemeen, dit hoeft niet overschreven te worden.
    private String petOwnerName;
    private String favouriteFoodBrandName;
    private String speciesName;

//    De huisdieren bewegen geen 0.5 meter maar 0.25 meter dus deze methode moeten we overschrijven.
//    Alle subklasses krijgen dit weer mee.
    @Override
    public void move() {
        System.out.println("Ik ben 25 centimeter verder gaan liggen");
    }
// Vervolgens maken we de setters en de getters voor de objecten.
    public String getPetOwnerName() {
        return petOwnerName;
    }

    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName;
    }

    public String getFavouriteFoodBrandName() {
        return favouriteFoodBrandName;
    }

    public void setFavouriteFoodBrandName(String favouriteFoodBrandName) {
        this.favouriteFoodBrandName = favouriteFoodBrandName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
