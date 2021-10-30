public class Main {

    public static void main(String arg[]){

        Stack myStack = new Stack(10);
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        myStack.push('d');
        myStack.push('e');
        myStack.push('f');

        String myString = "";
        myString = myString +  myStack.pop();
        myString = myString + myStack.pop();
        
         while(!myStack.isEmpty()){
             myString = myString + myStack.pop();
         }

         System.out.println(myString);

         System.out.println(reverseString(myString));

    }

    public static String reverseString(String str){

        String returnString = "";
        
        for(int i = str.length(); i > 0; i--){
            returnString = returnString + str.substring(i-1, i);
            
        }

        return returnString;
    }
    
}
