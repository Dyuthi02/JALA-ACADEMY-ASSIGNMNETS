//1. Write a function to add integer values of an array

package JALA_ACADEMY_ASSIGNMNETS.Arrays;


public class Add 
{
    static int arrSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        
        for (int i : a){
            System.out.print(i + " + ");
        }
        System.out.print(" =  " + arrSum(a));
    }
}
