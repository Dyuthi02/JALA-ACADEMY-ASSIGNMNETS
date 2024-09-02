/* 05. Create two interfaces with the same method (same signature) in both the interfaces.
 * Implement these two interfaces in one class. Call the method.
 */

package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


//interface 1
interface I1 {
    void sameMethod();
}

//interface 2
interface I2 {
    void sameMethod();
}

//Implemented these two interfaces in one class
class TwoInterfaceSameMethod implements I1, I2 {
    @Override
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
        if5.sameMethod();
    }
}
