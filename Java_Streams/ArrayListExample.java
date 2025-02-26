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

                // Printing the ArrayList contents
                System.out.println("List Elements: " + list);
        
                // Accessing an element at index 2
                System.out.println("Element at index 2: " + list.get(2));
                
                // Updating an element at index 3
                list.set(3, 100);
                System.out.println("Updated List: " + list);
                
                // Removing an element at index 1
                list.remove(1);
                System.out.println("List after removal: " + list);
                
                // Checking if an element exists
                System.out.println("List contains 50: " + list.contains(50));
                
                // Getting the size of the ArrayList
                System.out.println("Size of the list: " + list.size());
                
                // Clearing all elements from the ArrayList
                list.clear();
                System.out.println("List after clearing: " + list);
    }
}