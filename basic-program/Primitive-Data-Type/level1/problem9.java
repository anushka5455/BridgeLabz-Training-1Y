import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {

        double fee;
        double discountPercent;

        Scanner input = new Scanner(System.in);

        fee = input.nextDouble();
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}