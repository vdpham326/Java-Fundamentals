package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int num = 100;
        while(true) {
            System.out.println(num);
            if (num == 56) {
                break;
            }
            num--;
        }
    }
}
