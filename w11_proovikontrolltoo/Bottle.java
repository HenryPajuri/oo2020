
public class Bottle {

    BottleType bottleType;
    double bottleCost; //euros
    double bottleMass;
    static double maxVolume; //litres
    static double currentVolume;
    Beverage beverage;

    public Bottle(BottleType bottleType, double bottleCost, double bottleMass, double maxVolume, double currentVolume, Beverage beverage){
        this.bottleType = bottleType;
        this.bottleCost = bottleCost;
        this.bottleMass = bottleMass;
        Bottle.maxVolume = maxVolume;
        Bottle.currentVolume = currentVolume;
        this.beverage = beverage;
    }

    @Override
    public String toString(){
        return "This is a " + bottleType + ":\n" +  "It costs: " + bottleCost + " € \n" + "The mass of this bottle is " + bottleMass + " grams\n" + "And the Volume of this bottle is: " + maxVolume + " litres\n" + "Currenty it holds " + currentVolume +  " litres of " + beverage.name;
    }

}