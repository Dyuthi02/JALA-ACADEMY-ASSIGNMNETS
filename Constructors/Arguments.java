/*1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class */

package JALA_ACADEMY_ASSIGNMNETS.Constructors;

class ParentClass_01 {
    int rollNo;
    String name;
    String branch;

    //default constructor
    ParentClass_01() {
        System.out.println("Student Details");
    }

    //one argument constructor
    ParentClass_01(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    //two argument constructor
    ParentClass_01(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class Arguments {
    public static void main(String... args) {
        //calling constructors from main class
        //creating objects and passing values
        new ParentClass_01();
        new ParentClass_01(518);
        new ParentClass_01("Dyuthi", "CSE");
    }
}
