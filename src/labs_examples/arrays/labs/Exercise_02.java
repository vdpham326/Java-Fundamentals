package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.println("Enter a number from 1 - 10: ");
        int number = scan.nextInt();
        int index = -1;

        for(int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }

        System.out.println(index);


    }
}