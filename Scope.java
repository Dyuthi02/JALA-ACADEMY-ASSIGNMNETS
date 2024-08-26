/*5. Define the local and Global variables with the same name and print both variables and
understand the scope of the variables*/

package JALA_ACADEMY_ASSIGNMNETS;

public class Scope
{
    // Instance variable is declared inside the class but outside the body of the method.
    int a = 18;
    void localVariable() 
    {
        //Local variables are declared in methods, constructors, or blocks.
        int a = 46;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args)
     {
        Scope obj = new Scope();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
    }
    // NOTE : There is no such concept of Global Variables in Java.   
}
