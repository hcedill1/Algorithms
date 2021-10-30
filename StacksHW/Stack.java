public class Stack{
    private int size; 
    private char[] stackArray; 
    private int top;


    public Stack(int size){ 
        this.size = size; 
        this.stackArray= new char[size];
        this.top = -1;
    }

    public void push(char word){

        top ++; 
        stackArray[top] = word;
    }

    public char pop(){
        int old_top = top; 
        top--;
        return stackArray[old_top];
    }
    
    public char peak(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){

        return (size - 1 == top);
    }




}