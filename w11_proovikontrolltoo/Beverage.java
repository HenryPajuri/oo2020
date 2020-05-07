public class Beverage{

    public String name; 
    public double litreCost;
    public int weight; //grams per liter
    public BeverageType beverageType;
    
    public Beverage(String name, double litreCost, int weight, BeverageType beverageType){

        this.name = name;
        this.litreCost = litreCost;
        this.weight = weight;
        this.beverageType = beverageType;
    }  
    @Override
    public String toString(){
        return "This is " + name +": \n" + "It costs: " + litreCost + " € per litre" + "\n" + "It weighs " + weight + " grams per litre" + "\n" + "This beverage is: " + beverageType + ".";
    }
}