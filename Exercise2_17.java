import java.util.Scanner;

public class Exercise2_17{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        int average = sum / 3;

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }
}