/*Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet */

package JALA_ACADEMY_ASSIGNMNETS.Collections;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        //a. adding elements to the HashSet using add() method
        al.add("hi");
        al.add("hello");
        al.add("bye");
        al.add("sri");
        al.add("dyuthi");
        al.add("dulla");
        al.add("bhargavi");
        al.add("nani");
        al.add("madan");
        //does not allow duplicate elements, Set contains unique elements only.
        jala.add("bye");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("hs = " + hs);


        // Iterating through the HashSet by using Iterator object
        Iterator<String> itr = hs.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(hs.clone());

        //Removing a specific element using remove() method
        hs.remove("hi");
        System.out.println("\nAfter removing element 'hi' :");
        System.out.println("hs = " + hs);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(hs.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(hs.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(hs.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        hs.clear();
        System.out.println("hs = " + hs);
    }
    }
}
