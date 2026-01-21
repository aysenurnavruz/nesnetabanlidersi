
public class Main {
    public static void main(String[] args) {
        LinkList  theList = new LinkList();

        theList.insertToHead(22);
        theList.insertToHead(44);
        theList.insertToHead(66);

        theList.insertToTail(11);
        theList.insertToTail(33);
        theList.insertToTail(55);
        theList.displayList();

        theList.deleteFromHead();
        theList.deleteFromHead();
        theList.displayList();



    }
}