import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        int maksimumBoyut = 10;
        MusteriYoneticisi musteriYoneticisi = new MusteriYoneticisi(maksimumBoyut);
        while(true) {
            System.out.println("Müşteri Yönetimi Menüsü:");
            System.out.println("1.Müşteri Ekle");
            System.out.println("2. Müşterileri Sıralı Listele(Müşteri Numarasına Göre)");
            System.out.println("3. Müşterileri Normal Listele");
            System.out.println("4. Müşteri Ara");
            System.out.println("5. Müşteri sil");
            System.out.println("6. Çıkış");
            System.out.print("Bir seçenek seçin: ");

            int secim = tarayici.nextInt();
            tarayici.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Adınızı girin: ");
                    String ad= tarayici.nextLine();
                    System.out.print("Soyadınızı girin: ");
                    String soyad= tarayici.nextLine();
                    System.out.print("E-posta adresinizi girin: ");
                    String eposta= tarayici.nextLine();
                    System.out.print("Telefon numaranızı girin: ");
                    String telefon= tarayici.nextLine();

                    Musteri yeniMusteri = new Musteri(ad,soyad,eposta,telefon);
                    musteriYoneticisi.musteriEkle(yeniMusteri);
                    break;
                case 2:
                    musteriYoneticisi.musterileriSiralamaListele();
                    break;
                case 3:
                    musteriYoneticisi.musterileriListele();
                    break;
                case 4:
                    System.out.print("Aranacak müşteri bilgisini girin: ");
                    String anahtarKelime = tarayici.nextLine();
                    musteriYoneticisi.musteriAra(anahtarKelime);
                    break;
                case 5:
                    System.out.println("Silinecek müşterinin numarasını girin: ");
                    int silinecekMusteriNo = tarayici.nextInt();
                    musteriYoneticisi.musteriSil(silinecekMusteriNo);
                    break;
                case 6:
                    System.out.println("Müşteri Yönetimi Uygulamasından Çıkılıyor.");
                    tarayici.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");




            }
        }

    }
}