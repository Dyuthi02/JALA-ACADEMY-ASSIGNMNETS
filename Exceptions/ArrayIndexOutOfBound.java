/* 9. Write a program to generate ArrayIndexOutOfBoundException
 */

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;



public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        //Declaring 4 elements in the integer array
        int[] arr = {10,20,30,40};
        //ArrayIndexOutOfBoundException because there is no 5th index
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}