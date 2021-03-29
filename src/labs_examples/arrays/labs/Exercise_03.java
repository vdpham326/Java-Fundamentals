package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[0][0] = 3;
        for (int row = 0; row < array.length; row++){

            for (int col = 1; col < array[row].length; col++) {
                array[0][0] = 3;
                array[row][col]  = array[row][col - 1] + 3 ;
                System.out.print(array[row][col]);
            }
            System.out.println();

        }

    }
}
