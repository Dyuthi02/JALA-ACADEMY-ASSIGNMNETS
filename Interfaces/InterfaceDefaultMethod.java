/*06. Create an interface with a default method and implement it in a class. Do not provide
 * implementation to the default method and call the method.
 */

package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


//interface
interface I1 {
    //default method
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

class InterfaceDefaultMethod implements I1 {
    public static void main(String[] args) {
        //Didn't provide implementation to the default method
        InterfaceDefaultMethod ifn = new InterfaceDefaultMethod();
        //Calling the method
        ifn.defaultMethod();
    }
}
