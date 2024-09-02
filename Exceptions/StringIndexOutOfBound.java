/* 17. Write a program to generate StringIndexOutOfBoundsException
 */

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;

public class StringIndexOutOfBound {
    public static void main(String[] args) {

        String str = "Dyuthi";
        try {
            // Trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1);
            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            
            e.printStackTrace();
        }
    }
}