//3. Write a program to find the index of an array element

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Index {
    static void FindIndex(int a[], int n) {
        for (int i = 0; i < a.length; i++)
        {
            if (n == a[i]) {
                System.out.println(n + " is at index " + i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int index;
        
        int a[] = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("array values = " + Arrays.toString(a));
        System.out.print("Select a value to find Index of an array : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextByte();
        
        FindIndex(a, index);
        sc.close();
    }
}
