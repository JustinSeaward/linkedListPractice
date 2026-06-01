package DoubleLinkedList;

import SingleLinkedList.Node;

public class DoubleLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    public DoubleNode createDoubleLinkedList(int nodeValue){
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.next = null;
        doubleNode.value = nodeValue;
        head = doubleNode;
        tail = doubleNode;
        size = 1;
        return head;
    }

    // 1. if the link doesn't exist
    // 2. inserting element at the beginning
    // 3. inserting element at the end
    // 4. inserting anywhere else
    public void insertLinkedList(int nodeValue, int location){
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.value = nodeValue;

        if(head == null){
            createDoubleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            doubleNode.next = head;
            doubleNode.previous = null;
            head = doubleNode;
        } else if (location >= size) {
            doubleNode.next = null;
            doubleNode.previous = tail;
            tail.next = doubleNode;
            tail = doubleNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            DoubleNode nextNode = tempNode.next;
            doubleNode.previous = tempNode;
            doubleNode.next = tempNode.next;
            tempNode.next = doubleNode;
            doubleNode.next.previous = nextNode;
        }
        size++;
    }

    // traverse through a linked list
    public void traverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");

        }
    }

    // Reverse traverse through a linked list
    public void reverseTraverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.previous;

            }
            System.out.println("\n");

        }
    }

    // Search for an element in a double linked list
    // Delete method in a double linked list

    //EXERCISE 1: given a value, search for that element and return a boolean if the element exist or not.
    //EXERCISE 2: Given a location Implement a Delete method.

}
