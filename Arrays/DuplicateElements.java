//18. Write a program to remove the duplicate elements and return the new array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class DuplicateElements {
    static int removerDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
       
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        
        int[] arr = {11, 22, 22, 33, 44, 44, 55, 66, 66};
        
        System.out.println("arr[] = " + Arrays.toString(arr));
        int n = arr.length;
        
        n = removerDuplicate(arr, n);
        
        System.out.println("Array after removing duplicate values : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
