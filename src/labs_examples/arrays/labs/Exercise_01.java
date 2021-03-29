package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int counter = 0;
        int sum = 0;

        do {

            System.out.println("Enter number " + (counter + 1) + ": ");
            num[counter] = scan.nextInt();
            counter++;

        } while (counter < 10);

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        double avg = sum / (float) num.length;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);

    }
}