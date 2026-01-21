public class LinkList {
    private Link head;
    public LinkList(){// aslında zaten refrerans değeri null oolarak atanır başlangicta tüm değerler null
        // ama biz yinede gözümüzle görelim diye stuctarda(?) null olarak atadık
        head = null;
    }
    public void insertToHead(int id , double dd){
        Link newLink = new Link(id,dd);
        newLink.next =head;
        head = newLink;
    }
    public Link deleteFromHead(){
        Link temp = head;
        head =head.next;
        return temp;
    }
    public void displayList(){
        System.out.println("Liste: ");
        Link current = head;
        while(current!=null){
            current.displayLink();
            current =current.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return head ==null;
    }
}
