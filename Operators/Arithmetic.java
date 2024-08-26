//1. Write a function for arithmetic operators(+,-,*,/)

package JALA_ACADEMY_ASSIGNMNETS.Operators;

public class Arithmetic 
{
    void addition(int a, int b) {
        int add = a + b;
        System.out.println("Addition of a and b is a + b = " + add);
    }

    void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction of a and b is a - b = " + sub);
    }

    void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication of a and b is a * b = " + mul);
    }

    void division(int a, int b) {
        int div = a / b;
        System.out.println("Division of a and b is a / b = " + div);
    }

    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        int a = 18;
        int b = 46;
        //calling methods
        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
    }
}
