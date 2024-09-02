/*01. Create an interface with only one method and implement it in a class. Call the method
 * implemented.
 */ 


package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


//An interface is declared by using the interface keyword.
interface I1 {
    //An abstract method doesn't have its body, and they are public and abstract
    void oneMethod();
}

public class InterfaceOneMethod implements I1 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod ifn = new InterfaceOneMethod();
        //Calling the method implemented
        ifn.oneMethod();
    }
}