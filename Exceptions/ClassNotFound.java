/* 10.Write a program to generate ClassNotFoundException
 */

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;

public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.class");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.class");

        } catch (ClassNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}