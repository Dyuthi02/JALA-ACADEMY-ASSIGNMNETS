//8. Write a function to find the minimum and maximum value of an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class MinMax {
    static int minValue(int[] arr) {
        
        int min = arr[0];
       
        for (int j : arr)
            if (j < min)
                min = j;
        return min;
    }
    
    static int maxValue(int[] arr) {
        
        int max = arr[0];
       
        for (int j : arr)
            if (j > max)
                max = j;
        return max;
    }

    public static void main(String[] args) {
        
        int a[] = {10, 20, 30, 40, 50, 60};
        
        System.out.println("my_arr = " + Arrays.toString(a));
        
        System.out.println("The Maximum value is " + maxValue(a));
        
        System.out.println("The Minimum value is " + minValue(a));
    }
}
