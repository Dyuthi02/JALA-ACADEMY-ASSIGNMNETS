//2. Write a function to calculate the average value of an array of integers

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Scanner;

public class Average {
    static void average(int a[]) {
        int sum = 0;

        for (int i : a) {
            
            sum = sum + i;
        }
        
        float average = sum / a.length;
        
        System.out.print("The Average value of an array is " + average);
    }

    public static void main(String[] args) {
        
        int a[] = {10, 20, 30, 40, 50};
        
        average(a);
}
