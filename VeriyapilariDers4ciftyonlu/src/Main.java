
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertToHead(22);
        theList.insertToHead(44);
        theList.insertToHead(66);

        theList.insertToTail(11);
        theList.insertToTail(33);
        theList.insertToTail(55);


        theList.displayForward();//ctrl d kısayolu satırdakinin aynısını aşağıya yazar
        theList.displayBackward();

        theList.deleteFromHead();
        theList.deleteFromTail();
        theList.delete(11);

        theList.displayForward();


    }
}