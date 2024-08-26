//12. Print gender (Male/Female) program according to given M/F using switch

package JALA_ACADEMY_ASSIGNMNETS.Loops;

import java.util.Scanner;

public class MaleOrFemale 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Gender : ");
        char n=sc.next().charAt(0);
        switch(n){
            case 'M':
                System.out.print("Gender : Male");
                break;
            case 'F':
                System.out.print("Gender : Female");
            default:
                System.out.print("Invalid Input");
        }
        sc.close();
    }
}
