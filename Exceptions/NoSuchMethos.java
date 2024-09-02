
/* 14.Write a program to generate NoSuchMethodException
 */
package JALA_ACADEMY_ASSIGNMNETS.Exceptions;


import java.lang.reflect.Method;
//creating a class
class E {
    //creating a method which receives two integer values as parameters
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethos {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("JALA_ACADEMY_ASSIGNMNETS.Exceptions.E");
            //There is no subtraction() method in class E
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        //Throws NoSuchMethodException
        catch (NoSuchMethodException | ClassNotFoundException e) {
            
            e.printStackTrace();
        }
    }
}