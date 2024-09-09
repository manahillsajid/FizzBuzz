/**
 * Solve the FizzBuzz challenge.
 */

/**
 * java's and syntax = &&
 * similar:
 * - if statement structure
 * - same variable types (boolean and int)
 * different:
 * - have to write variable type before variable declaration
 * - need to have a main method where all the code is run
 * - System.out.println() (java) vs. print() (python)
 */
class FizzBuzz {

    public static void main(String[] args) {

 //     doFizzBuzzfor();
        int i = 1;
        while (i <= 100) {
            i = doFizzBuzz(i);
        }


    }

    private static void doFizzBuzzfor() {
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
