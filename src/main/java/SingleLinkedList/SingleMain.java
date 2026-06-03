package SingleLinkedList;

public class SingleMain {
    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(1,0);
        singleLinkedList.insertLinkedList(2,1);
        singleLinkedList.insertLinkedList(3,2);
        singleLinkedList.insertLinkedList(4,3);
        singleLinkedList.insertLinkedList(5,4);
        singleLinkedList.insertLinkedList(6,5);
        singleLinkedList.insertLinkedList(7,6);
        singleLinkedList.insertLinkedList(8,7);
        singleLinkedList.insertLinkedList(9,8);
        singleLinkedList.insertLinkedList(10,9);

        System.out.println();
        singleLinkedList.traverseLinkedList();

        System.out.println("Number 5 is in list - " + singleLinkedList.searchForElement(5) + "\n");
        singleLinkedList.deleteElement(4);
        System.out.println("Removed number five from the list\n");

        System.out.println("Number 5 is in list - " + singleLinkedList.searchForElement(5) + "\n");

        singleLinkedList.traverseLinkedList();

        System.out.println("Remove number 1\n");
        singleLinkedList.deleteElement(0);

        System.out.println("Number 1 is in list - " + singleLinkedList.searchForElement(1) + "\n");

        singleLinkedList.traverseLinkedList();

        System.out.println("Remove number 10\n");
        singleLinkedList.deleteElement(9);

        System.out.println("Number 10 is in list - " + singleLinkedList.searchForElement(10) + "\n");

        singleLinkedList.traverseLinkedList();
    }
}
