import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DoubleLinkList extends Sehir {
    public Link head;
    public Link tail;

    public DoubleLinkList() {
        super();
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void insert(Sehir sehir) {
        // İsim kontrolü
        if (isCityNameExists(sehir.sehirAd)) {
            System.out.println("Aynı isimde bir şehir zaten var. Yeni şehir eklenemedi.");
            return;
        }
        Link newLink = new Link(sehir);
        if (isEmpty()) {
            head = newLink;
            tail = newLink;
        } else {
            ArrayList<Link> cityList = new ArrayList<>();
            Link current = head;

            while (current != null) {
                cityList.add(current);
                current = current.next;
            }

            cityList.add(newLink);
            Collections.sort(cityList, Comparator.comparing(o -> o.sehir.sehirAd));

            head = cityList.get(0);
            tail = cityList.get(cityList.size() - 1);

            for (int i = 0; i < cityList.size() - 1; i++) {
                cityList.get(i).next = cityList.get(i + 1);
                cityList.get(i + 1).previous = cityList.get(i);
            }
        }
        plakaNoUpdate();
    }

    private boolean isCityNameExists(String cityName) {
        Link current = head;

        while (current != null) {
            if (current.sehir.sehirAd.equals(cityName)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void plakaNoUpdate() {
        Link current = head;
        int count = 1;
        while (current != null) {
            current.sehir.plakaNo = count;
            current = current.next;
            count++;
        }
    }
    public Link find(int plakaNo) {
        Link current = head;

        while (current != null) {
            if (current.sehir.plakaNo == plakaNo) {
                return current;
            }
            current = current.next;
        }
        System.out.println("Plaka Numarası " + plakaNo + " olan şehir bulunamadı.");
        return null;
    }
    public Link find(String sehirAd) {
        Link current = head;
        while (current != null) {
            if (current.sehir.sehirAd.trim().equalsIgnoreCase(sehirAd.trim())) {
                return current;
            }
            current = current.next;
        }
        System.out.println(sehirAd + " adlı şehir bulunamadı.");
        return null;
    }
    public void delete() {
        head = null;
        tail = null;
    }
    public void delete(String sehirAd) {
        Link current = head;
        while (current != null && !current.sehir.sehirAd.equals(sehirAd)) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }
        // Plaka numaralarını güncelleme
        current = current.next;
        int count = 1;
        while (current != null) {
            current.sehir.plakaNo = count;
            current = current.next;
            count++;
        }
    }
    public void delete(int plakaNo) {
        Link current = head;
        // Silinecek şehri bul
        while (current != null && current.sehir.plakaNo != plakaNo) {
            current = current.next;
        }
        // Şehir bulunamazsa
        if (current == null) {
            System.out.println("Plaka Numarası " + plakaNo + " olan şehir bulunamadı.");
            return;
        }
        // Eğer baştaki şehir siliniyorsa
        if (current.previous == null) {
            head = current.next;
        } else {
            current.previous.next = current.next;
        }
        // Eğer sondaki şehir siliniyorsa
        if (current.next == null) {
            tail = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        // Plaka numaralarını güncelle
        current = head;
        while (current != null) {
            if (current.sehir.plakaNo > plakaNo) {
                current.sehir.plakaNo--;
            }
            current = current.next;
        }
        System.out.println("Plaka Numarası " + plakaNo + " olan şehir silindi.");
    }
    public void displayForward() {
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
    public void displayBackward() {
        Link current = tail;

        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
    }
    public void sortList() {
        if (isEmpty()) {
            return;
        }
        Link current = null;
        Link index = null;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.sehir.nufus > index.sehir.nufus) {
                    Sehir temp = current.sehir;
                    current.sehir = index.sehir;
                    index.sehir = temp;
                }
            }
        }
    }
}



