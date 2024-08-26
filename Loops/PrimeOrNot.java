//9. Write a program to find the prime or not.

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.print(n+" is a Prime number");
        }
        else
        {
            System.out.print(n+" is not a Prime number");
        }
        sc.close();
    }
}
