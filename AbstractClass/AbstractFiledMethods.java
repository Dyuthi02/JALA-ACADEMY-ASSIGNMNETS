/*1. Create an abstract class with abstract and non-abstract methods.
2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods
3. Create an instance for the child class in child class and call abstract methods
4. Create an instance for the child class in child class and call non-abstract methods */


package JALA_ACADEMY_ASSIGNMNETS.AbstractClass;

abstract class A{
    //An abstract method doesn't have its body
    abstract void m1();

    //non-abstract method
    void m2() {
        System.out.println("This is m2 method");
    }
}

//subclass for an abstract class
class B extends A {
    //provide implementation of abstract method
    void m1() {
        System.out.println("This is m1 method");
    }

    public static void main(String[] args) {
        A obj = new B();
        //accessing the non-abstract methods
        obj.m2();

        //instance for the child class
        B L = new B();
        //calling abstract methods
        L.m1();
        //calling non-abstract methods
        L.m2();
    }
}