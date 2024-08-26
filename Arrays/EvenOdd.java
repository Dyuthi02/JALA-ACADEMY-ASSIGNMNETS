//15. Write a method to find number of even number and odd numbers in an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    static void evenNumber(int a[]) {
        System.out.print("Even numbers in array : ");
        
        for (int i : a) {
            
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
    static void oddNumber(int a[]) {
        System.out.print("\nOdd numbers in array : ");
        for (int j : a) {
            if (j % 2 != 0) {
                System.out.print(j + "  ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("a[] = " + Arrays.toString(a));
        
        evenNumber(a);
        oddNumber(a);

        sc.close();
    }
}
