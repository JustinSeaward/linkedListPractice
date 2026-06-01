package SingleLinkedList;

import java.util.LinkedList;

public class SingleLinkedListTest {

    static void main() {
        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Kennedy");
        names.add("Justin");
        names.add("Chris");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(10, 0);
        singleLinkedList.insertLinkedList(20,1);
    }
}
