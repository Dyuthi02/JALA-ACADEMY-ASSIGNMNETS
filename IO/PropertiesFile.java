//Write a program to read data from properties file.

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String args[]) {

        try {
            //Instantiating the properties file
            Properties props = new Properties();
            //Populating the properties file
            props.put("Name", "Dyuthi");
            props.put("E.no", "518");
            props.put("College", "VSM");

            //Instantiating the FileInputStream for output file
            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            //Storing the properties file
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
