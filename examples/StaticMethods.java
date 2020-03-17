/**
 * StaticMethods
 */
public class StaticMethods {

    private int x;

    public StaticMethods(int x){
        this.x = x;
    }

    public static void main(String[] args) {
        String number = "54";

        int i = Integer.parseInt(number);

        System.out.println(i);

        StaticMethods sm = new StaticMethods(4);
        sm.speak();
    }

    void speak(){
        System.out.println(this.x);
    }
}