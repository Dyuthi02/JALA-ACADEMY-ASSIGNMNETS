/* 07. Create an interface and inherit it from the other interface.
 */

package JALA_ACADEMY_ASSIGNMNETS.Interfaces;

//interface
interface I1 {
    void methodOne();
}

//inherited interface
interface I2 extends I1 {
    void methodTwo();
}

class InheritedInterface implements I2 {
    //override method of interface I1
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface I2
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface ifn = new InheritedInterface();
        //Calling the methods implemented
        ifn.methodOne();
        ifn.methodTwo();
    }
}
