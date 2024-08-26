//13. Write a method to find the second largest number in an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class SecondLargest {
    static void secondLargest(int a[]) {
        int temp;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in Array : " + a[a.length - 2]);
    }

    public static void main(String[] args) {
        
        int a[] = {10, 2, 35, 46, 58};
        System.out.println("arr[] = " + Arrays.toString(a));
        
        secondLargest(a);
    }
}
