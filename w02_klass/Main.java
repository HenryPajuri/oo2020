/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Character raimo = new Character("Raimo", CharacterType.WARRIOR);

        raimo.slogan = "Hey";
        raimo.height = 191;
        
        System.out.println(raimo);
    }
}