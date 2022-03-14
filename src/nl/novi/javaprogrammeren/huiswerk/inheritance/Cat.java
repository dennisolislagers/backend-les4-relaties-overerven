package nl.novi.javaprogrammeren.huiswerk.inheritance;
//  Cat is a Pet, dus maken we de subklasse Cat aan die bij de superklasse Pet hoort.
public class Cat extends Pet {

//  We kijken of een kat een buitenkat is of niet, dit doen we met een boolean, want het is true or false.
    private boolean isOutsideCat;
//     De kat miauwt
    @Override
    public void sound() {
        System.out.println("Meow");
    }
// We zetten de default van de boolean.
    public boolean isOutsideCat() {
        return isOutsideCat;
    }
//  De output van de boolean moet op false komen als dit wordt gevraagd.
    public void setOutsideCat(boolean outsideCat) {
        isOutsideCat = outsideCat;
    }
}
