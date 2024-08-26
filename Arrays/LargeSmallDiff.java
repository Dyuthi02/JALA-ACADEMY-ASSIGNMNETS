//16. Write a function to get the difference of largest and smallest value

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class LargeSmallDiff {
    static void difference(int a[]) {
        int max = a[0];
        int min = a[0];
        int difference;
        for (int i = 1; i < a.length; i++) {
            
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        difference = max - min;
        
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
        
        System.out.println("\nDifference of largest and smallest values : " + difference);
    }

    public static void main(String[] args) {
        
        int a[] = {11, 62, 35, 94, 52};
        System.out.println("a[] = " + Arrays.toString(a));
        
        difference(a);
    }
}
