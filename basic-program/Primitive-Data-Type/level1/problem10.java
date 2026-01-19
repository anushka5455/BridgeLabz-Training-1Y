import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {

        double heightCm;
        double heightInInches;
        int feet;
        double inches;

        Scanner input = new Scanner(System.in);

        heightCm = input.nextDouble();

        heightInInches = heightCm / 2.54;
        feet = (int) (heightInInches / 12);
        inches = heightInInches % 12;

        System.out.println(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );

        input.close();
    }
}