package nl.novi.javaprogrammeren.huiswerk.inheritance;
//      We maken de abstracte subklasse Pet aan die hoort bij de superklasse Animal.
//      Vervolgens gaan we de klasse 'vullen' met subklasses die bij de klasse Pet horen.
public abstract class Pet extends Animal {
//      Alle objecten van de subklasse Pet hebben het volgende gemeen, dit hoeft niet overschreven te worden.
//      Alle subklasses krijgen dit weer mee.
    private String petOwnerName;
    private String foodName;
    private String speciesName;

//     De constructor wordt aangemaakt.

    public Pet(String name, String gender, String petOwnerName, String foodName, String speciesName) {
        super(name, gender);
        this.petOwnerName = petOwnerName;
        this.foodName = foodName;
        this.speciesName = speciesName;
    }

//      Vervolgens maken we de setters en de getters voor de objecten.
//      Getters

    public String getPetOwnerName() {
        return petOwnerName;
    }
    public String getFoodName() {
        return foodName;
    }
    public String getSpeciesName() {
        return speciesName;
    }
//      Setters
    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
//     Vervolgens gaan we de methode maken wat de huisdieren allemaal doen.
//     De huisdieren bewegen geen 0.5 meter maar 0.25 meter dus deze methode die in de klasse Animal staat moeten we overschrijven.
    @Override
    public void move() {
        System.out.println("Ik ben 25 centimeter verder gaan liggen");
}
}
