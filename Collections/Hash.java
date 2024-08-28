/*Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map */

package JALA_ACADEMY_ASSIGNMNETS.Collections;

import java.util.*;

public class Hash {
    public static void main(String[] args) {

        //reate a HashMap with at least 10 key value pairs of the Student ID and Name

        //Insert a Key value mapping into the map

        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(1,"dyuthi");
        hs.put(2,"myti");
        hs.put(3,"genie");
        hs.put(4,"pratyu");
        hs.put(5,"laddu");
        hs.put(6,"hema");
        hs.put(7,"samyu");
        hs.put(8,"bhargavi");
        hs.put(9,"gayatri");
        hs.put(10,"pooji");

        //Fetch the value of a Key

        System.out.println(hs.get(7));

        //Create a clone/copy of HashMap

        System.out.println(hs.clone());

        //Check if the given Key is in the Map

        System.out.println(hs.containsKey(8));

        //Check if the value is in the Map

        System.out.println(hs.containsValue("myti"));
        
        //Check if the map is empty

        System.out.println(hs.isEmpty());   
        
        //Print the size of the Map to the console

        System.out.println(hs.size()); 

        //Print all the Keys of the map to the console

        System.out.println(hs.keySet());

        //Remove a specific Key-value pair
        
        hs.remove(2,"myti");

        System.out.println(hs);
        
        //Copy all the elements of the Map to another Map

        HashMap<Integer,String> hs1=new HashMap<>();
        hs1.putAll(hs);

        System.out.println(hs1);
        

    }
}
