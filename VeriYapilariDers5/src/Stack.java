public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray =new long[this.maxSize];
        top=-1;
    }
    public void push(long j){
        if (!isFull())
        stackArray[++top]=j;
    }
    public long pop(){
        if (!isEmpty())
        return stackArray[top--];
        else return -1;
    }
    public long peek(){
        if (!isEmpty())
           return  stackArray[top];
        else return-1;
    }
    public boolean isEmpty(){
        return top ==-1;

    }
    public boolean isFull(){
        return top==maxSize-1;

    }


}
