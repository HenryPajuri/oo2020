
public class Barrel {

    public Beverage beverage; //What type of beverage is inside
    public static double maxVolume;
    public static double currentVolume; // in litres

    public Barrel(Beverage beverage, double maxVolume, double currentVolume) {

        this.beverage = beverage;
        Barrel.maxVolume = maxVolume;
        Barrel.currentVolume = currentVolume;
    }
    
    public void fillUp(){
        if (Barrel.currentVolume >= (Bottle.maxVolume - Bottle.currentVolume)){
            Barrel.maxVolume = Barrel.maxVolume - (Bottle.maxVolume - Bottle.currentVolume);
            Bottle.currentVolume = Bottle.maxVolume;
        } else{
            System.out.println("There isn't enough liquid in the barrel to fill up your bottle..");
        }

        
    }
}