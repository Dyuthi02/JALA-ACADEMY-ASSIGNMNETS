//13. Program for multiple if else statement(Largest number in 10,20 and 30)

package JALA_ACADEMY_ASSIGNMNETS.Loops;


public class MultipleIf 
{
    public static void main(String[] args) {
        System.out.print("Enter First number: ");
        int a = 10;
        System.out.print("Enter Second number: ");
        int b = 20;
        System.out.print("Enter third number: ");
        int c = 30;
        if(a>b && a>c)
        {
            System.out.print(a+" is Biggest number");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is Biggest Number");
        }
        else
        {
            System.out.print(c+" is Biggest Number");
        }
    }
}
