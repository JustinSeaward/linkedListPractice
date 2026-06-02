package SingleLinkedList;

public class SingleMain {
    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(1,0);
        singleLinkedList.insertLinkedList(2,1);
        singleLinkedList.insertLinkedList(3,2);
        singleLinkedList.insertLinkedList(4,3);

        singleLinkedList.traverseLinkedList();
//      LinkedList<String> test = new LinkedList<>();

        // put in a println to see the output
        System.out.println(singleLinkedList.searchForElement(5));

    }
}
