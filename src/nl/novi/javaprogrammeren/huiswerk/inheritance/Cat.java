package nl.novi.javaprogrammeren.huiswerk.inheritance;

//      Cat is a Pet, dus maken we de subklasse Cat aan die bij de superklasse Pet hoort.
public class Cat extends Pet {

//      We kijken of een kat een buitenkat is of niet, dit doen we met een boolean, want het is true or false.
//      Verder heeft de klasse Cat geen andere objecten dan diegene die in de klasse Pet staan.
    private boolean outsideCat;
//      En weer maken we de constructor.

    public Cat(String name, String gender, String petOwnerName, String foodName, String speciesName, boolean isOutsideCat) {
        super(name, gender, petOwnerName, foodName, speciesName);
        this.outsideCat = outsideCat;
    }
//De getter en de setter.

    public boolean isOutsideCat() {
        return outsideCat;
    }

    public void setOutsideCat(boolean outsideCat) {
        this.outsideCat = outsideCat;
    }

    //     De kat miauwt, dus moeten we de methode sound overschrijven met het geluid dat een Kat maakt
    @Override
    public void sound() {
        System.out.println("Meow");
    }

}
