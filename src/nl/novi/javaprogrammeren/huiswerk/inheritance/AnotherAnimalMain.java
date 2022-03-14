package nl.novi.javaprogrammeren.huiswerk.inheritance;
// In de Main klasse gaan we de objecten aanmaken.
public class AnotherAnimalMain {

    public static void main(String[] args) {
//        Elk object gaat straks iets doen vanuit de methode van de subklasse.
        Lion lion = new Lion("King", "male", "Hills", "Woensdag", "Afrika", 4);
        lion.sound();
        lion.sleep();
        lion.move();


        Tiger tiger = new Tiger("Pluisje", "female", "Hills", "Donderdag", "Azie", 24);
        tiger.sound();
        tiger.sleep();
        tiger.move();


        Wolf wolf = new Wolf("Boris", "male", "Forest", "Vrijdag", "Europa", "Oosten-roedel");
        wolf.sound();
        wolf.sleep();
        wolf.move();


        Cat cat = new Cat("Poesje", "female", "Hendrik", "Kittekat", "Zilverrugkat", true);
        cat.sound();
        cat.sleep();
        cat.move();


        Dog dog = new Dog("Sjuul", "male", "Dennis", "Frikandel", "Golden Retriever");
        dog.sound();
        dog.sleep();
        dog.move();


    }

}
