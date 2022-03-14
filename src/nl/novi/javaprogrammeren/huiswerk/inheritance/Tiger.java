package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Tiger extends BigAnimal{
private int stripes;

    public Tiger(String name, String gender, String cageName, String feedingDay, String origin, int stripes) {
        super(name, gender, cageName, feedingDay, origin);
        this.stripes = stripes;
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }
    public void sound(){
        System.out.println("Wraoor");
    }
}
