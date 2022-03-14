package nl.novi.javaprogrammeren.huiswerk.inheritance;
// In de Main klasse gaan we de objecten aanmaken.
public class AnotherAnimalMain {

    public static void main(String[] args) {
//        Elk object gaat straks iets doen vanuit de methode van de subklasse.
        Lion lion = new Lion();
        lion.sound();
        lion.sleep();
        lion.move();
        lion.eat();

        Tiger tiger = new Tiger();
        tiger.sound();
        tiger.sleep();
        tiger.move();
        tiger.eat();

        Wolf wolf = new Wolf();
        wolf.sound();
        wolf.sleep();
        wolf.move();
        wolf.eat();

        Cat cat = new Cat();
        cat.sound();
        cat.sleep();
        cat.move();
        cat.eat();

        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
        dog.move();
        dog.eat();

    }

}
