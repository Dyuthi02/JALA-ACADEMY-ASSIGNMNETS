/* 7.Write a program with finally block
 */

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;


public class FinallyBlock {

    public static void main(String args[]) {
        try {
            //below code throws divide by zero exception
            int data = 10 / 0;
            System.out.println(data);
        }
        //handles the Arithmetic Exception / Divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        //finally block executes regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Main method ended");
    }
}