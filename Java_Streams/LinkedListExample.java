package Java_Streams;

import java.util.LinkedList; // Importing LinkedList class from java.util package

/**
 * Author: Kali
 * 
 * This class demonstrates the usage of LinkedList in Java.
 */
public class LinkedListExample { // Renamed class to reflect LinkedList usage
    
    /**
     * This method creates a LinkedList of integers, adds elements to it,
     * and prints the contents.
     */
    void demonstrateLinkedList() {
        System.out.println("LinkedList Example"); // Printing a message
        
        // Creating a LinkedList of Integer type
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        // Getting the size of the LinkedList
        System.out.println("Size of the list: " + list.size());
        
    }

    
}
