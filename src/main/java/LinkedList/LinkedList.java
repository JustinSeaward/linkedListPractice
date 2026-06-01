package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addData(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        } else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void display(){

        if(head == null){
            System.out.println("Head is null");
        } else{
            Node current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
