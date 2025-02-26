package Java_Streams;

import java.util.ArrayList; // Importing ArrayList class from java.util package

/**
 * Author: Kali
 * 
 * This class demonstrates the usage of ArrayList in Java.
 */
public class ArrayListExample {  // Renamed class to follow Java naming conventions
    
    /**
     * This method creates an ArrayList of integers, adds elements to it,
     * and prints the contents.
     */
    void demonstrateArrayList() {
        System.out.println("ArrayList Example"); // Printing a message
        
        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        // Printing the ArrayList contents
        System.out.println("List Elements: " + list);
    }
}