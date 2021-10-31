import javax.sound.sampled.SourceDataLine;

/**
 * Linked list is a data structure that store a collection of items 
 * drawbacks for arrays, if you intert items more than the size 
 * you have to recreate a new array and recopy all of the elements with 
 * a different size array, which means that it is memory intensive
 * you can insert items in the beginning of the list and back of the list 
 * also in the middle.
 * 
 * You can grow the size of the collection
 * you can change the links to point at other nodes
 * like an array you cannot change the address in wihch the 
 * data is being stored
 * 
 * if you delete something in the middle 
 * the nodes will point at the next element 
 */

public class Node{
    //recursive data type, 
    Node next = null; 
    int data; 

    public void displayNode(){ 
        System.out.println("{" + data + "}");
    }

}