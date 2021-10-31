import java.time.temporal.Temporal;

public class SinglyLinkedList {

    private Node head; 
    
    public boolean isEmpty(){
        return (head == null);
    }

    //used to insert at the beginning of the list

    public void insertFirst(int data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head; //so the newNode field is pointing to the old Head 
        head = newNode; //so we have the head point to the new node     
    }

    public void insertLast(int data){
        Node current = head; 
        while (current != null){
            current = current.next;
        }

        Node newNode = new Node(); 
        newNode.data = data; 
        current.next = newNode;
    }

    public Node deleteFirst(){
        Node temp = head; 
        head = head.next;
        return temp;
    }

    public void displayList(){ 
        System.out.println("List(first -->last) ");
        Node current = head;
        while (current != null){

            current.displayNode();
            current = current.next;
        } 

        System.out.println();

    }
    
}
