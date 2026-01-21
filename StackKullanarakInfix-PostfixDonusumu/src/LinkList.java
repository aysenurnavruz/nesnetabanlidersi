public class LinkList { Link head;

    LinkList() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertToHead(char data) {
        Link newLink = new Link(data);
        newLink.next = head;
        head = newLink;
    }

    char deleteFromHead() {
        if (isEmpty()) {
            System.out.println("Listede eleman yok");
            return 0;
        }
        char temp = head.data;
        head = head.next;
        return temp;
    }

    char displayHead() {
        if (isEmpty()) {
            System.out.println("Listede eleman yok");
            return 0;
        }
        return head.data;
    }
}


