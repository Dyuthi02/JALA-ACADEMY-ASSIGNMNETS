//6. Write a function to copy an array to another array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    static void copyArray(int a[]) {
        
        int copy[] = a;
        
        System.out.println("Array after copying to c = " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store : ");
        int n=sc.nextInt();
        
        System.out.println("Enter the Elements of the array ");
        
        int[] my_arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("my_arr[%d] = ", i);
            
            my_arr[i] = sc.nextInt();
        }
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        /
        copyArray(my_arr);
    }
}
