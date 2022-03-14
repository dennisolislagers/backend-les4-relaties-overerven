package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class Animal {
//      Elk object heeft een naam en een geslacht, dit hoeft niet overschreven te worden.
//      Daarom zijn ze private.
    private String name;
    private String gender;
//      We gaan uit van de wilde dieren, deze zijn in de meerderheid, de methodes moeten wel overschreven kunnen worden.
    public void move() {
        System.out.println("Ik ben een halve meter verder gaan slapen!!");
    }
//      De volgende methode is voor elk dier hetzelfde, maar kan eventueel in de toekomst worden overschreven.
    public void sleep(){
        System.out.println("Ik ben lekker acht uur aan het slapen");
    }
//      De volgende methode krijgt een argument mee want elk dier eet iets anders.
    public void eat(String foodName) {
        System.out.println("Ik eet het liefst: " + foodName);
    }
//     Voor het geluid dat een dier maakt maken we een abstracte klasse aan die overschreven wordt door het object.
    public abstract void sound();

}