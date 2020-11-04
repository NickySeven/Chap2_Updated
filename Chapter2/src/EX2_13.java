import java.util.Scanner;

public class EX2_13 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount:");
        int amount = input.nextInt();

        final double INTEREST = 1 + 0.00417;

        double first = amount * INTEREST;
        double second = (amount + first) * INTEREST;
        double third = (amount + second) * INTEREST;
        double fourth = (amount + third) * INTEREST;
        double fifth = (amount + fourth) * INTEREST;
        double sixth = (amount + fifth) * INTEREST;

        System.out.println("After the sixth month, the account value is $" +sixth);
    }
}
