//6. Write a function to print your name and call the function from main method

package JALA_ACADEMY_ASSIGNMNETS;

public class PrintName {
    public void print(String a)
    {
        System.out.print(a);
    }
    public static void main(String[]args)
    {
        PrintName obj=new PrintName();
        obj.print("Dyuthi sri");
    }
}
