/*1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
4. Call argument constructor of current class using this()
 */

package JALA_ACADEMY_ASSIGNMNETS.This_and_super;

public class UsingThis {
    int num;
    String name;

    UsingThis() {
        //3. Calling argument constructor of current class using this()
        this(18, "Dyuthi");
    }

    UsingThis(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        UsingThis ts1 = new CallUsingThis();
        UsingThis ts = new CallUsingThis(46, "Sri");
    }
}
