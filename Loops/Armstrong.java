//8. Write a program to find Armstrong number or not

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int t=n,arm=0;
        while(t!=0)
        {
            int r=t%10;
            arm+=(int)Math.pow(r,3);
            t/=10;
        }
        if(n==arm)
        {
            System.out.print(n+" is a Armstrong number");
        }
        else
        {
            System.out.print(n+" is not a Armstrong number");
        }
        sc.close();
    }    
}
