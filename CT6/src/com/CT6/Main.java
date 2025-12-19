package com.CT6;

import java.util.Iterator;

/**
 * Program that utilizes the CustomLinkedList and performs inserting single values
 * and multiple values that are read from file, deleting values, and creates iterator
 * object to iterate through the linked list.
 *
 * @author Nolan_Hill
 */
public class Main {
    public static void main(String[] args) {
        // Initiate new CustomLinkedList
        CustomLinkedList linkedList = new CustomLinkedList();

        // Insert some elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // Delete some elements
        linkedList.delete(2);
        linkedList.delete(1);

        // Attempt to delete element that doesn't exist in list
        linkedList.delete(34);

        // Test the readFromFile method
        linkedList.readFromFile("data.txt");

        // Create iterator object for the CustomLinkedList
        Iterator<Integer> iterator = linkedList.iterator();

        // Iterate and display elements
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}