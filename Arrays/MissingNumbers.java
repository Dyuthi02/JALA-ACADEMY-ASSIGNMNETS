//19. Write a function to find the missing number of sorted array of 1 to 100

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class MissingNumbers {
    static void missingNumber(int a[]) {
        
        Arrays.sort(a);
        System.out.println("a[] = " + Arrays.toString(a));
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (j < a.length && i == a[j]){
                j++;
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        
        int a[]= {10, 20, 30, 40, 50, 60, 70, 80, 90};
       
        missingNumber(a);
}
