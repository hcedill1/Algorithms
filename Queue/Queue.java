
//first in first out
public class Queue{
    private int maxSize; // intializes the set number of slots 
    private long[] queArray; //this will be the index position for the element in the front
    private int front;//this will be index posotion of the front 
    private int rear; //this will be index position at the end of the line
    private int nItems; //counter to maintain the number of item in out queue

    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        front = 0; 
        rear = -1;
        nItems = 0;
    }

}