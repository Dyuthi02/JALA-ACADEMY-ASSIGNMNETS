//4. Write a program to print the odd and even numbers

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;
public class EvenOrOdd 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.print(n+" is a Even number");
        }
        else
        {
            System.out.print(n+" is a Odd number");
        }
        sc.close();
    }
}
