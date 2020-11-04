import java.util.Scanner;

public class EX2_21 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage:");
        double annualInterest = input.nextDouble();

        System.out.println("Enter number of years:");
        int years = input.nextInt();

        double monthInterest = (annualInterest / 100) / 12;

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthInterest),(years*12));

        System.out.println ("Accumulated value is  " + futureInvestmentValue);
    }
}
