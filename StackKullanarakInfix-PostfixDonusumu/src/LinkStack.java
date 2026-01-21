public class LinkStack {
    LinkList theList;

    LinkStack() {
        theList = new LinkList();
    }

    void push(char c) {
        theList.insertToHead(c);
    }

    char pop() {
        return theList.deleteFromHead();
    }

    char peek() {
        return theList.displayHead();
    }

    boolean isEmpty() {
        return theList.isEmpty();
    }
}
