import java.util.Scanner;

public class AmazonPrime {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();

            Divisible(num);
            Prime(num);

            for (int i = 2; i < 1000; i++) {

                if (checkPrime(i)) {

                    System.out.print(i + "  ");

                }

            }

        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    public static void Divisible(int num) {
        if (num % 3 == 0) {

            System.out.println("The number you entered is divisible by 3");

        }
        if (num % 5 == 0) {

            System.out.println("The number you entered is divisible by 5");

        }
        if (num % 7 == 0) {

            System.out.println("The number you entered is divisible by 7");
        }

    }

    public static void Prime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        int i = 2;
        while (i <= n / 2) {
            if ((n % i) == 0)
                return false;
            i++;
        }

        return true;
    }

}
