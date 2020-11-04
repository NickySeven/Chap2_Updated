import java.util.Scanner;

public class EX2_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in double, for example 1156:");
        int amount = input.nextInt();

        int numberOfDollars = (int) (amount / 100);
        int cents = amount % 100;

        System.out.println("Your amount " +amount+ "consists of");
        System.out.println(" " +numberOfDollars+ " dollars and " +cents+ " cents");
    }
}
