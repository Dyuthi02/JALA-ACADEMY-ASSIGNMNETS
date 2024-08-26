//1. Write a function to add integer values of an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;


import java.util.Scanner;

public class Add 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.print("sum of numbers of an array is : "+sum);
        sc.close();
    }    
}
