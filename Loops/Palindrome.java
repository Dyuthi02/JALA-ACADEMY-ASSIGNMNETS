//10. Write a program to palindrome or not.

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int t=n,rev=0;
        while(t!=0)
        {
            int r=t%10;
            rev=rev*10+r;
            t/=10;
        }
        if(rev==n)
        {
            System.out.print(n+" is a Palindrome");
        }
        else
        {
            System.out.print(n+" is not a Palindrome");
        }
        sc.close();
    }
}
