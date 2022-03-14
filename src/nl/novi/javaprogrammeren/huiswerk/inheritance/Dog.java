package nl.novi.javaprogrammeren.huiswerk.inheritance;

//      Dog is a Pet, dus maken we de subklasse Dog aan die bij de superklasse Pet hoort.
public class Dog extends Pet{
    public Dog(String name, String gender, String petOwnerName, String foodName, String speciesName) {
        super(name, gender, petOwnerName, foodName, speciesName);
    }

    //      De klasse Dog heeft geen andere methodes dan in de klasse Pet staat. Alleen het geluid dat hij maakt en het voer dat hij eet, is specifiek en moet overschreven moeten worden.
    @Override
    public void sound() {
        System.out.println("Woef");
    }

}
