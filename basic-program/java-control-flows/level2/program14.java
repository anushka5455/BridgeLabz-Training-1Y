import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        if (power >= 0) {

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println("Result = " + result);

        } else {
            System.out.println("Power should be a non-negative integer.");
        }

        sc.close();
    }
}
