public class Stacks{ 

    private int maxSize; 
    private long[] stackArray; 
    private int top; 

    public Stacks(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

}