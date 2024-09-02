/*Also, Access the PROTECTED fields and methods from child class located in a different package
Access the PROTECTED fields and methods from any class in different package */

package JALA_ACADEMY_ASSIGNMNETS.Access2;

import JALA_ACADEMY_ASSIGNMNETS.Access_Modifiers.ProtectedFiledMethods;

public class ProtectedFiled extends ProtectedFiledMethods{
    public static void main(String[] args) {
        //Creating object of AccessingProtectedFieldsMethod
        ProtectedField sub = new ProtectedField();
        //Accessing protected field
        sub.name = "Protected Method in SubClass";
        //Accessing protected method
        sub.protectedMethod();
    }
    /* NOTE :
             - protected member can be access within the package and
                outside the package but within the child classes */
}
