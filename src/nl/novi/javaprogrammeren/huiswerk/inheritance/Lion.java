package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Lion extends BigAnimal{
//    Van de Leeuw willen we alleen het aantal kinderen weten dus maken we deze variable aan.
    private int amountOfChildren;
//    De bijbehorende constructor.

    public Lion(String name, String gender, String cageName, String feedingDay, String origin, int amountOfChildren) {
        super(name, gender, cageName, feedingDay, origin);
        this.amountOfChildren = amountOfChildren;
    }
//    De setter en de getter.

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }
//    De methodes

    @Override
    public void sound() {
        System.out.println("Wraor");;
    }
}
