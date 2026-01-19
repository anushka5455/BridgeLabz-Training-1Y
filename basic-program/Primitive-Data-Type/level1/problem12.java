import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {

        double base;
        double height;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        double areaInSqInches = 0.5 * base * height;

        double baseCm = base * 2.54;
        double heightCm = height * 2.54;
        double areaInSqCm = 0.5 * baseCm * heightCm;

        System.out.println(
            "The area of the triangle is " + areaInSqInches +
            " square inches and " + areaInSqCm + " square centimeters"
        );

        input.close();
    }
}