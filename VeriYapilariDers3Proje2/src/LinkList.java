public class LinkList {
    public Link head;
    public Link tail;

    public LinkList(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void insertToHead(long d){
        Link newLink = new Link(d);
        if (isEmpty())//liste boşmu

            tail = newLink;
        newLink.next = head;
        head=newLink;
    }
    public void insertToTail(long d){
        Link newLink = new Link(d);

        if (isEmpty())
            head = newLink;
        else
            tail.next = newLink;
        tail =  newLink;
    }
    public Link deleteFromHead(){
        Link temp = head;
        if (head.next==null)
            tail = null;
        head =head.next;
        return temp;
    }
    public void displayList(){
        System.out.println("Liste (Head--> Tail):");
        Link current= head;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();

    }
}
