public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray =new char[this.maxSize];
        top=-1;
    }
    public void push(char j){
         stackArray[++top]=j;
    }
    public char pop(){
        return stackArray[top--];
    }
    public char peek(){
        return  stackArray[top];
    }
    public boolean isEmpty(){
        return top ==-1;

    }
    public boolean isFull(){
        return top==maxSize-1;

    }


}

