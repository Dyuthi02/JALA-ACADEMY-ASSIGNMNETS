/* 12. Write a program to generate IOException
 */

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;


import java.io.*;

//IOExceptions are thrown when there is any input / output file operation issues
public class GenerateIOException {
    public static void main(String[] args) {

        File file = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read();
            fis.close();
        }
        //FileNotFoundException is a subclass of IOException.
        catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}