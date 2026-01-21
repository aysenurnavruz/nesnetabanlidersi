import java.util.*;

public class MusteriYoneticisiLinkList {
    private Link head;

    public MusteriYoneticisiLinkList() {
        head = null;
    }
    Random random = new Random();// Müşteri numarasını rastgele atamak için.

    public void musteriEkle(Musteri musteri){
        int rastgele = random.nextInt(10);// Müşteri numarasına random numara atama yapmak için sayı oluşturuldu..
        Link musteriEkle = new Link(musteri);
        musteri.setMusteriNo(rastgele);//müşteri numarasına atadım bu random sayıyı.
        Musteri.sonrakiMusteriNo = rastgele;
        musteriEkle.next = head;
        head = musteriEkle;
        System.out.println("Müşteri başarıyla eklendi: " + musteri);


    }

    public void musteriSiralilistele() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }
        int listeUzunlugu = 0;
        Link temp = head;
        while (temp != null) {
            listeUzunlugu++;
            temp = temp.next;
        }
        Musteri[] musteriDizisi = new Musteri[listeUzunlugu];

        int diziSirasi = 0;
        Link tmp = head;
        while (tmp != null) {
            musteriDizisi[diziSirasi++] = tmp.musteri;
            tmp = tmp.next;
        }

        for (int i = 0; i < musteriDizisi.length - 1; i++) {
            for (int j = 0; j < musteriDizisi.length - 1 - i; j++) {
                if (musteriDizisi[j].getMusteriNo() > musteriDizisi[j + 1].getMusteriNo()) {
                    Musteri tempMusteri = musteriDizisi[j];
                    musteriDizisi[j] = musteriDizisi[j + 1];
                    musteriDizisi[j + 1] = tempMusteri;
                }
            }
        }

        for (Musteri musteri : musteriDizisi) {
            if (musteri != null) {
                System.out.println(musteri);
            }
        }
    }

    public void musteriNormalListele() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }

        Link temp = head;
        while (temp != null) {
            System.out.println(temp.musteri);
            temp = temp.next;
        }
    }

    public void musteriAra(String anahtarKelime) {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }

        Link temp = head;
        while (temp != null) {
            if (temp.musteri.eslesmeKontrol(anahtarKelime)) {
                System.out.println(temp.musteri);
            }
            temp = temp.next;
        }
    }

    public void musteriSil(int silinecekMusteriNo) {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }

        if (head.musteri.getMusteriNo() == silinecekMusteriNo) {
            head = head.next;
            return;
        }

        Link temp = head;
        while (temp.next != null) {
            if (temp.next.musteri.getMusteriNo() == silinecekMusteriNo) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Müşteri bulunamadı");
    }


}