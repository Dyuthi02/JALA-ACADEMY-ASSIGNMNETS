//12. Write a method to remove duplicate elements from an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    static int removeDuplicate(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n - 1];
        
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        
        int a[] = {11, 20, 22, 30, 30, 44, 56, 56, 66};
        
        System.out.println("arr[] = " + Arrays.toString(a));
        int n = a.length;
        
        n = removeDuplicate(a, n);
        
        System.out.println("Array after removing duplicate values : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
            
    }
}
