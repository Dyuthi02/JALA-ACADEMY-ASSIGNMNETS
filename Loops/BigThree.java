//5. Write a program to print largest number among three numbers.

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;

public class BigThree 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();

        int big = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.print("The biggest number is "+big);

        sc.close();
    }    
}
