package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] arr = {
                {547, 23},
                {123, 345, 89},
                {456, 876, 345, 677}
        };

        for (int[] outer: arr) {
            for (int val: outer) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
