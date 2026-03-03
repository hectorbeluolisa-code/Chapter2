import java.util.Scanner;

public class Exercise2_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number = input.nextInt();

        int smallest = number;
        int largest = number;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter integer: ");
            number = input.nextInt();

            if (number < smallest)
                smallest = number;

            if (number > largest)
                largest = number;
        }

        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }
}