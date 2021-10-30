

public class Main {

    public static void main(String arg[]){
        Stacks theStack = new Stacks(3);
        theStack.push(29);
        theStack.push(49);    
        theStack.push(495);
        theStack.push(495);

        while(!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }

        
    }
    
}
