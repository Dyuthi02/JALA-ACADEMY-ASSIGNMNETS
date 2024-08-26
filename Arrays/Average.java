//2. Write a function to calculate the average value of an array of integers

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Scanner;

public class Average {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c++;
            sum+=a[i];
        }
        System.out.print("Average value of an array of integers is : "+(float)sum/c);
        sc.close();
    }    
}
