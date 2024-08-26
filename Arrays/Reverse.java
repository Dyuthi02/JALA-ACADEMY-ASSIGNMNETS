//9. Write a function to reverse an array of integer values

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class Reverse {
    static void reverseArray(int a[]) {
        
        int r_arr[] = new int[a.length];
        
        int j = a.length;
        for (int i : a) {
            r_arr[j - 1] = i;
            j = j - 1;
        }
        System.out.println("Reversed Array  : " + Arrays.toString(r_arr));
    }

    public static void main(String[] args) {
        
        int a[] = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array : " + Arrays.toString(a));
        
        reverseArray(a);
    }
}
