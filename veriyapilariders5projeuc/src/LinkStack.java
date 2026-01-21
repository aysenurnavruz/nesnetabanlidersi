public class LinkStack {
    private LinkList theList;
    public LinkStack(){
        theList = new LinkList();
    }
    public void push(long d){
        theList.insertToHead(d);
    }
    public long pop(){
        return theList.deleteFromHead();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack (top-->buttom)");
        theList.displayList();
        System.out.println();
    }
    public long peek(){
        return theList.displayHead();
    }
}
