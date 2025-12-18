package com.CT6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList {
    private Node head;

    // Other methods...

    /**
     * Inserts a new node with the given data
     * @param data the data assigned to a node
     */
    public void insert(int data) {
        // FIXME: Implement insertion logic
    }

    /**
     * Deletes the first occurrence of a node with the given data
     * @param data the data to look for in node for deletion
     */
    public void delete(int data) {
        // FIXME: Implement deletion logic
    }

    /**
     * Creates an iterator for traversing the linked list
     * @return new LinkedListIterator variable
     */
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private class LinkedListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int data = current.data;
            current = current.next;
            return data;
        }
    }

    // Other methods...
}
