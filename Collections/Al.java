/*Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList */

package JALA_ACADEMY_ASSIGNMNETS.Collections;

import java.util.*;

public class Al {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();

        //Add an element to the ArrayList

        al.add("hi");
        al.add("hello");
        al.add("bye");
        al.add("sri");
        al.add("dyuthi");
        al.add("dulla");
        al.add("bhargavi");
        al.add("nani");
        al.add("madan");

        //Iterate through the ArrayList by using Iterator object

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //Add an element at a specific index

        al.add(2,"very");

        System.out.print(al);

        System.out.println();

        //Remove an element from the ArrayList, Remove at an index

        al.remove(3);

        System.out.print(al);

        System.out.println();

        //Update the element at a specific index

        al.set(4,"good");

        System.out.print(al);

        System.out.println();
        
        //Check the element is present at a particular index

        al.indexOf("sri");

        System.out.print(al);

        System.out.println();

        //Get an element at a particular index

        al.get(4);

        System.out.print(al);

        System.out.println();

        //Find out the size of the ArrayList

        al.size();

        System.out.print(al);

        System.out.println();

        //Check the given element is present in the ArrayList

        System.out.print(al.contains("dyuthi"));

        //Remove all elements of the ArrayList 

        al.removeAll(al);

        System.out.print(al);

        System.out.println();
        
    }
}
