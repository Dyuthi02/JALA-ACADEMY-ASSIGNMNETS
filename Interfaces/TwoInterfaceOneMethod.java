/* 04.Create two interfaces with one method each. Implement these two interfaces in one
 * class.
 */

 package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


//interface 1
interface I1 {
    void methodOne();
}

//interface 2
interface I2 {
    void methodTwo();
}

//Implemented these two interfaces in one class
public class TwoInterfaceOneMethod implements I1, I2 {
    @Override
    public void methodOne() {
        System.out.println("This is Method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceOneMethod if4 = new TwoInterfaceOneMethod();
        //Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
    }
}