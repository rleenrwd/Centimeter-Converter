import java.util.Scanner;

/* This program is designed to convert centimeters to feet and inches */

public class Convert {
    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner user_input = new Scanner(System.in);

        //Prompt the user and get the value
        System.out.print("Enter the number of centimeters to convert: ");
        cm = user_input.nextDouble();

        // Convert and output the result
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }
}
