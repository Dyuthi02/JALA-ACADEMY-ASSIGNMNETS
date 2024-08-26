//3. Program to equal operator and not equal operators

package JALA_ACADEMY_ASSIGNMNETS.Operators;

import java.util.Scanner;

public class EqualOp 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");

        // "nextInt()" scans the next token of the input as an Int.
        int a = sc.nextInt();

        System.out.print("Enter second number : ");

        int b = sc.nextInt();
        
        //equal operator (==)
        if (a == b) {
            System.out.println("Both are numbers equal");
        }
        //not equal operator (!=)
        else if (a != b) {
            System.out.println("Both are numbers different");
        }
        sc.close();
    }
}
