package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class BigAnimal extends Animal {
//      Van de grote dieren willen we van ze allemaal de volgende drie variabele weten.
    private String cageName;
    private String feedingDay;
    private String origin;
//    Vervolgens maken we de constructor:

    public BigAnimal(String name, String gender, String cageName, String feedingDay, String origin) {
        super(name, gender);
        this.cageName = cageName;
        this.feedingDay = feedingDay;
        this.origin = origin;
    }
//      Aansluitend maken we hier de getters en de setters van.
//      De getters.
public String getCageName() {
    return cageName;
}
    public String getFeedingDay() {
        return feedingDay;
    }
    public String getOrigin() {
        return origin;
    }
//      Setters
    public void setCageName(String cageName) {
        this.cageName = cageName;
    }
    public void feedingDay(String feedingDay) {
        this.feedingDay = feedingDay;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
