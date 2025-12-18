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
        linkedList.delete(1);
        linkedList.delete(34);

        // Test the readFromFile method
        linkedList.readFromFile("data.txt");

        // Iterate and display elements
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}