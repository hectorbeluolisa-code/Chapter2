import java.util.Scanner;

public class Exercise2_35{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input daily driving info
        System.out.print("Enter total miles driven per day: ");
        double miles = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parking = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        // Calculate daily driving cost
        double fuelCost = (miles / milesPerGallon) * costPerGallon;
        double totalCost = fuelCost + parking + tolls;

        System.out.printf("Your daily driving cost is: $%.2f%n", totalCost);
    }
}