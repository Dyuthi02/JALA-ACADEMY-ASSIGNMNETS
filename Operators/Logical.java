//5. Programs on Logical AND,OR operator and Logical NOT

package JALA_ACADEMY_ASSIGNMNETS.Operators;

public class Logical 
{
    public static void main(String[] args) {
        int a = 18;
        int b = 46;
        int c = 23;
        // Logical AND (&&)
        /* The logical && operator doesn't check the second condition if the
        first condition is false. It checks the second condition only if the first one is true. */
        System.out.println(a > b && a > c); // false  && true  = false
        System.out.println(a < b && a < c); // true && true = true
        System.out.println(a > b && a < c); // false  && false = false

        //Logical OR (||)
        /* The logical || operator doesn't check the second condition if the
        first condition is true.It checks the second condition only if the first one is false. */
        System.out.println(a > b || a > c); // false  || false  = false
        System.out.println(a < b || a < c); // true || true = true
        System.out.println(a < b || a > c); // false || false  = false

        //Logical NOT [!()]
        System.out.println(!(a > b));      // NOT false = true
        System.out.println(!(a < b));      // NOT true = false
    }    
}
