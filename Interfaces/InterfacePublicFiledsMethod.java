/* 08. Create a PUBLIC interface with fields and methods, fields should have values assigned.
 * Implement this interface to some class and print the values of the interface fields and
 * call the interface methods
 */

package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


//public interface with fields and methods
public interface InterfacePublicFiledsMethod {
    //all the fields are public, static and final by default
    int num = 518; //values assigned

    public void myMethod();
}

//Implemented interface to a class
class A implements InterfacePublicFiledsMethod {
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }

    //main method
    public static void main(String[] args) {
        A j = new A();
        //printing the values of the interface fields
        System.out.println(num);
        //calling the interface methods
        j.myMethod();
    }
}