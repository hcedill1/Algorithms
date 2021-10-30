public class Stacks{ 

    private int maxSize; 
    private long[] stackArray; 
    private int top; 

    public Stacks(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        //we want to set into -1 instead of zero becuae there is nothing on the stack
        this.top = -1;
    }

    /**
     * this will push the elements into the array from value 0
     * @param j
     */
    public void push(long j){

        top++; 
        stackArray[top] = j;
        
    }

    /**
     * this will show which element on top of the stack got popped and will
     * will return it
     * 
     * @return
     */

    public long pop(){
        int old_top = top; 
        top--;
        return stackArray[old_top];
    }
    /**
     * this will be checking the current index that top is in and go into the array
    */
    public long peak(){

        return stackArray[top];
    }
    /**
     * becuae arrays start at index 1 we want to go ahead and 
     * have the stack be represented as -1 in order for it be empty
     * @return
     */
    public boolean isEmpty(){
        return (top == -1);
    }

    /**
     * Making sure that the stack is full so, top is incremented and will make sure that it is not equal
     * maxsize, if it is, it will print out as true stack is full
     * @return
     */
    public boolean isFull(){
        return (maxSize-1 == top);
    }



}