/*1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
 * 2. Print instance variables in static methods
3. Print static variables in Instance methods
4. Call instance methods in static methods
5. Call static methods in instance methods
6. Print all the static, instance variables in main method
7. Call static methods and instance methods in main method
 */

package JALA_ACADEMY_ASSIGNMNETS.Static;

import java.util.Scanner;

public class Q1 {
    static Scanner sc=new Scanner(System.in);
    static int a = sc.nextInt();
    static String b = sc.next();
    float c = sc.nextFloat();
    double d = sc.nextDouble();
    static int m1(String a)
    {
        System.out.println("This is method 1,the value is : "+a);
        return sc.nextInt();
    }
    static float m2(boolean b)
    {
        System.out.println("This is method 2,the value is : "+b);
        return sc.nextFloat();
    }
    boolean m3(int c)
    {
        System.out.println("This is method 3,the value is : "+c);
        return sc.nextBoolean();
    }
    long m4(float d)
    {
        System.out.println("This is method 4,the value is : "+d);
        return sc.nextLong();
    }
    public static void main(String[] args) {
        Q1 obj=new Q1();
        System.out.println(Q1.a);
        System.out.println(Q1.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println(Q1.m1(sc.next()));
        System.out.println(Q1.m2(sc.nextBoolean()));
        System.out.println(obj.m3(sc.nextInt()));
        System.out.println(obj.m4(sc.nextFloat()));
    }
}
