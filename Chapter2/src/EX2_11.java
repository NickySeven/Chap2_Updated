import java.util.Scanner;

public class EX2_11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of years:");
        int numberOfYears = input.nextInt();

        int currentPopulation = 312032486;

        int year = 365;
        int secondsInAYear = year * 24 * 60 * 60;

        int births = secondsInAYear / 7;
        int deaths = secondsInAYear / 13;
        int immigrants = secondsInAYear / 45;

        int addPopulation = births - deaths + immigrants;

        System.out.println("The population in " +numberOfYears+ " years is " + (currentPopulation + (addPopulation * (numberOfYears))));
    }
}
