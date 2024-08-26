//17. Write a method to verify if the array contains two specified elements(12,23)

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsValue {
     static void contains(int a[], int n1,int n2) {
        boolean no1 = false;
        boolean no2 = false;
        
        for (int i : a) {
            
            if (i == n1) {
                no1 = true;
            }
            if (i==n2){
                no2 = true;
            }
        }
        if (no1) {
            System.out.printf("Contains %d in the array", n1);
        } else {
            System.out.printf("\nDoesn't Contain %d in the array", n1);
        }
        if (no2) {
            System.out.printf("\nContains %d in the array", n2);
        } else {
            System.out.printf("\nDoesn't Contain %d in the array", n2);
        }
        System.out.println("\na[] = " + Arrays.toString(a));
    }
    public static void main(String[] args) {
        
        int a[] = {12, 29, 12, 33, 34, 23, 33};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to verify (n1 & n2): ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        contains(a, n1,n2);
    }
}
}
