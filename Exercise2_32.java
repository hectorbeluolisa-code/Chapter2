import java.util.Scanner;

public class Exercise2_32{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number: ");
            int num = input.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;
        }

        System.out.printf("Positive: %d%n", positive);
        System.out.printf("Negative: %d%n", negative);
        System.out.printf("Zero: %d%n", zero);
    }
}