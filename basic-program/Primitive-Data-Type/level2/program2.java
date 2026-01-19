import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double heightCm = input.nextDouble();

        // Area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert base and height to inches
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        // Area in square inches
        double areaIn2 = 0.5 * baseInches * heightInches;

        System.out.println(
            "The area of the triangle in sq in is " + areaIn2 +
            " and sq cm is " + areaCm2
        );

        input.close();
    }
}
