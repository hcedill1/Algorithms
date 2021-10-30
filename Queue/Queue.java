
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
        front = 0; //index position of the slot of the array 
        rear = -1; //there is no item in the array yet to the considered as the last time
        nItems = 0; //we dont have element in the array yet
    }

    public void insert(long j){

        if(rear == maxSize -1){
            rear = -1; //so once it gets back to its max it will set back to 0 position and rewrite.
        }else{ 
            rear++;
            queArray[rear] = j;
            nItems ++;
        }
        
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i] + " ");

        }

        System.out.println("]");
    }
    //remove item from the front
    public long remove(){
        long temp = queArray[front];
        front++;
        if(front == maxSize){
            front = 0; //we can set front back to the zero position so we can utilize entiere array again
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return nItems == maxSize;
    }





}