/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members */

package JALA_ACADEMY_ASSIGNMNETS.Inheritance;


import java.util.Scanner;

class A
{
    static Scanner sc=new Scanner(System.in);
    int a=10;
    int m1(float b)
    {
        System.out.println("This is m1,the value is : "+b);
        return sc.nextInt();
    }
    String m2(boolean b)
    {
        System.out.println("This is m2,the value is : "+b);
        return sc.next();
    }
    void m3(int c)
    {
        System.out.println("This is overriden method,the value is : "+c);
    }
}
class B extends A
{
    int a=20;
    int m4(float b)
    {
        System.out.println("This is m4,the value is : "+b);
        return A.sc.nextInt();
    }
    String m5(boolean b)
    {
        System.out.println("This is m5,the value is : "+b);
        return sc.next();
    }
    void m3(int c)
    {
        System.out.println("This is overriden method,the value is : "+c);
    }
}
class C extends B
{
    int a=30;
    int m6(float b)
    {
        System.out.println("This is m6,the value is : "+b);
        return sc.nextInt();
    }
    String m7(boolean b)
    {
        System.out.println("This is m7,the value is : "+b);
        return sc.next();
    }
    void m3(int c)
    {
        System.out.println("This is overriden method,the value is : "+c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //object for class A

        A obj=new A();
        System.out.println(obj.m1(A.sc.nextFloat()));
        System.out.println(obj.m2(A.sc.nextBoolean()));
        obj.m3(A.sc.nextInt());

        //object for class B

        B obj1=new B();
        System.out.println(obj1.m4(A.sc.nextFloat()));
        System.out.println(obj1.m5(A.sc.nextBoolean()));
        obj.m3(A.sc.nextInt());

        //object for class C

        C obj2=new C();
        System.out.println(obj2.m6(A.sc.nextFloat()));
        System.out.println(obj2.m7(A.sc.nextBoolean()));
        obj.m3(A.sc.nextInt());
        
        //Calling an overridden method with super class reference

        A ob;
         //upcasting
        ob=new B();
        ob.m3(A.sc.nextInt());
         //upcasting
        ob = new C();
        ob.m3(A.sc.nextInt());


        //Runtime Polymorphism with Data Members
        A ob1;
        ob1 = new A();
        System.out.println(ob1.a);
        ob1 = new B();
        System.out.println(ob1.a);
        ob1 = new C();
        System.out.println(ob1.a);

        /*Method is overridden not the data members,
        so runtime polymorphism can't be achieved by data members. */
    }
}
