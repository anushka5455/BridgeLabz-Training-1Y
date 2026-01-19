import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {

        double distanceInFeet;
        double distanceInYards;
        double distanceInMiles;

        Scanner input = new Scanner(System.in);

        distanceInFeet = input.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.println(
            "The distance in feet is " + distanceInFeet +
            " while in yards is " + distanceInYards +
            " and in miles is " + distanceInMiles
        );

        input.close();
    }
}