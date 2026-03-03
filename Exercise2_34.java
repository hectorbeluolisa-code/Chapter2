import java.util.Scanner;

public class Exercise2_34{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (as percent): ");
        double growthRate = input.nextDouble();

        double growthFactor = 1 + (growthRate / 100);

        for (int year = 1; year <= 5; year++) {
            population *= growthFactor;
            System.out.printf("Population after year %d: %.0f%n", year, population);
        }
    }
}