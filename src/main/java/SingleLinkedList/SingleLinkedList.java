package SingleLinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert into a linked list
    public void insertLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // traverse through a linked list
    public void traverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");

        }
    }


    //EXERCISE 1: given a value, search for that element and return a boolean if the element exist or not.

    public boolean searchForElement(int number){

        if(head == null) {
            System.out.println("Linked list dose not exist");
        } else{
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == number){
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        return false;
    }

    //EXERCISE 2: Given a location implement a delete method.

    public void deleteElement(int location){
        Node tempNode = head;

        if(head == null){
            System.out.println("Linked list dose not exist");
        }
        else if (location == 0) {
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
        else if (location >= size - 1){
            for(int i = 0; i < size - 2; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else {
            for(int i = 0; i <= location - 2; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

}
