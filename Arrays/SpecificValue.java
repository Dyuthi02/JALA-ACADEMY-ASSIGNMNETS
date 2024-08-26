//4. Write a function to test if array contains a specific values

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpecificValue {
    static boolean contains(int a[], int n) {
        //using for-each loop
        for (int i : a) {
            //returns if given n value is in index
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the value which should be searched : ");
       
        boolean Value = contains(a, n);
        if (Value) {
            System.out.println("Contains " + n + " in the array");
            System.out.println(Arrays.toString(a));
        } else {
            System.out.println("Does not Contains " + n + " in the array");
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
