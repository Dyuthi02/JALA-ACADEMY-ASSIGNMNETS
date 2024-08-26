//1. How to create a class, object, method and its signature

public class CallingMethod 
{
// created a class using "class" keyword
    //created a method using methodName()
    void isMethod() 
    {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) 
    {
        // Created an object 
        CallingMethod obj = new CallingMethod();
        // Calling the method
        obj.isMethod();
    }
}