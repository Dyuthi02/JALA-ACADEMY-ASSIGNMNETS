//11. Program to check whether a number is EVEN or ODD using switch

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;

public class EvenOrOddSwitch
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        switch(n%2){
            case 1:
                System.out.print(n+" is a Odd number");
                break;
            case 0:
                System.out.print(n+" is a Even Number");
            default:
                System.out.print("Invalid Input");
        }
        sc.close();
    }
}
