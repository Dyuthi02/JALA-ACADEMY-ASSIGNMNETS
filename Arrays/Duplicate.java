//10. Write a function to find the duplicate values of an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;

import java.util.Arrays;

public class Duplicate {
     static void duplicateValues(int a[]) {
        
        System.out.println("Duplicate values : ");
        for (int i = 0; i < a.length - 1; i++) {
            
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j] && (i != j))) {
                    
                    System.out.print(a[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
       
        int a[] = {10, 20, 30, 44, 50, 20, 44, 30};
        
        System.out.println("array =  " + Arrays.toString(a));
        
        duplicateValues(a);
    }
}
