

public class Main {

        public static void main(String[] args) {
            
            Beverage cocoa = new Beverage("cocoa", 3, 50, BeverageType.NON_ALCOHOLIC);
            Bottle glassBottle = new Bottle(BottleType.GLASSBOTTLE, 0.2, 100, 1, 0.6, cocoa);
            Barrel woodenBarrel = new Barrel(cocoa, 100, 50);
            woodenBarrel.fillUp();
            System.out.println(cocoa);
            System.out.println("");
            System.out.println(glassBottle);
        }
    }
