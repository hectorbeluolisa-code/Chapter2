import java.util.Scanner;

public class Exercise2_33{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Input height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // BMI formula for pounds/inches: BMI = (weight / (height^2)) * 703
        double bmi = (weight / (height **2)) * 703;

        System.out.printf("Your BMI is %.2f%n", bmi);

        // BMI Evaluation (US HHS/NIH)
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal weight");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}