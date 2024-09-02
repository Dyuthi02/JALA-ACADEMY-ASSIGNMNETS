/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class. */

package JALA_ACADEMY_ASSIGNMNETS.Access_Modifiers;

public class PrivateFieldMethods {
    //private fields
    private String name = "Dyuthi";
    private int age = 22;

    //private method
    private void ptMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    //main method
    public static void main(String[] args) {
        PrivateFieldMethods obj = new PrivateFieldMethods();
        //Printing the fields in main method
        System.out.println(obj.age);
        System.out.println(obj.name);
        //Calling the private method in main method
        obj.ptMethod();
    }
    /*NOTE : A subclass does not inherit the private members of its parent class*/
}
