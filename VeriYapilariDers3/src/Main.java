
public class Main {//çekirdek kodunuz ne kadar azsa kodnuz o kadar iyidir, yani main metodunda ne kadar az kod varsa o kadar iyi.

    public static void main(String[] args) {
        LinkList  theList = new LinkList();

        theList.insertToHead(1,11.11);
        theList.insertToHead(2,5.99);
        theList.insertToHead(3,6.11);
        theList.insertToHead(4,8.55);

        theList.displayList();
        while(!theList.isEmpty()){
            Link aLink = theList.deleteFromHead();
            System.out.println("Silinen: ");
            aLink.displayLink();
        }
        theList.displayList();





    }
}