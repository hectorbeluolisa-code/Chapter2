import java.util.Scanner;

public class Exercise2_26{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.println("First is a multiple of second");
        else
            System.out.println("First is not a multiple of second");
    }
}