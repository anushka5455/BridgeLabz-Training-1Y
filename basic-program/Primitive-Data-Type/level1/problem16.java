import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {

        int numberOfStudents;
        int handshakes;

        Scanner input = new Scanner(System.in);

        numberOfStudents = input.nextInt();

        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
            "The maximum number of handshakes among " + numberOfStudents +
            " students is " + handshakes
        );

        input.close();
    }
}