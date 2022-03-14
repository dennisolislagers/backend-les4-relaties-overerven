package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Wolf extends BigAnimal {
    private String packName;

    public Wolf(String name, String gender, String cageName, String feedingDay, String origin, String packName) {
        super(name, gender, cageName, feedingDay, origin);
        this.packName = packName;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    @Override
    public void sound() {
        System.out.println("Whooooooooooo");
    }
}
