package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {
// We spreken de variabelen aan:
        Car audi = new Car("H-844-GD", "Audi", "A3", 100000);
        Car VW = new Car("02-KPG-8", "Volkswagen", "Polo", 56345);

        CarOwner Dennis = new CarOwner("Dennis", "Olislagers", 49);
        CarOwner Iris = new CarOwner("Iris", "Ummels", 44);

        CarDealer Wealer = new CarDealer("Wealer", "Fregatweg 24", 23);
        CarDealer Janssen = new CarDealer("Janssen", "Hoogweg 65", 45);

        Janssen.addCar(audi);
        Wealer.addCar(VW);

        Janssen.transferCarToOwner(audi, Dennis);
        Wealer.transferCarToOwner(VW, Iris);
    }
}
