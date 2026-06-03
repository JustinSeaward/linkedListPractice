package DoubleLinkedList;

public class DoubleMain {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertLinkedList(1,0);
        doubleLinkedList.insertLinkedList(2,1);
        doubleLinkedList.insertLinkedList(3,2);
        doubleLinkedList.insertLinkedList(4,3);
        doubleLinkedList.insertLinkedList(5,4);
        doubleLinkedList.insertLinkedList(6,5);
        doubleLinkedList.insertLinkedList(7,6);
        doubleLinkedList.insertLinkedList(8,7);
        doubleLinkedList.insertLinkedList(9,8);
        doubleLinkedList.insertLinkedList(10,9);

        doubleLinkedList.traverseLinkedList();
        doubleLinkedList.reverseTraverseLinkedList();
        System.out.println("The number nine in the list: " + doubleLinkedList.searchForElement(9));
        System.out.println("The number 11 in the list: " + doubleLinkedList.searchForElement(11));


    }
}
