import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        DoubleLinkList sehirList= new DoubleLinkList();

        while(true){
            System.out.println("Şehir Plaka Yönetim Sistemi Menüsü");
            System.out.println("1. Şehir Ekle");
            System.out.println("2.Şehir Listele İleriye Doğru");
            System.out.println("3.Şehir Listele Geriye Doğru");
            System.out.println("4.Şehir Listele(Nüfusa göre küçükten büyüğe");
            System.out.println("5.Şehir ara(Plaka No veya Şehirismi ile)");
            System.out.println("6.Şehir sil(Plaka No,Şehir ismi veya Tamamı)");
            System.out.println("7.Tüm şehirleri sil");
            System.out.println("8.Çıkış");
            System.out.print("Bir seçenek seçin: ");

            int secim= tarayici.nextInt();
            tarayici.nextLine();

            switch (secim){
                case 1:
                    System.out.print("Şehir ismini girin: ");
                    String sehirAd = tarayici.nextLine();
                    System.out.print("Şehir nüfus bilgisini giriniz: ");
                    long nufus= tarayici.nextLong();

                    Sehir yeniSehir = new Sehir(sehirAd,nufus);
                    sehirList.insert(yeniSehir);
                    break;
                case 2:
                    System.out.println("Şehir Listesi İleriye Doğru:");
                    sehirList.displayForward();
                    break;

                case 3:
                    System.out.println("Şehir Listesi Geriye Doğru:");
                    sehirList.displayBackward();
                    break;

                case 4:
                    System.out.println("Nüfusa Göre Sıralı Şehir Listesi:");
                    sehirList.sortList();
                    sehirList.displayForward();
                    break;

                case 5:
                    System.out.print("Aranacak Şehir Adı veya Plaka No: ");
                    String searchKey = tarayici.next();
                    Link foundLink = null;
                    try {
                        int plakaNo = Integer.parseInt(searchKey);
                        foundLink = sehirList.find(plakaNo);
                    } catch (NumberFormatException e) {
                        foundLink = sehirList.find(searchKey);
                    }
                    if (foundLink != null) {

                        System.out.println("Aranan şehir: " + foundLink.sehir.sehirAd + ", Plaka No: " + foundLink.sehir.plakaNo);
                    }
                    break;

                case 6:
                    System.out.print("Silinecek Şehir Adı, Plaka No veya Tamamı: ");
                    String deleteKey = tarayici.next();
                    try {
                        int plakaNo = Integer.parseInt(deleteKey);
                        sehirList.delete(plakaNo);
                    } catch (NumberFormatException e) {
                        // Eğer giriş bir sayıya dönüştürülemezse, şehir adına göre silme işlemi yap
                        sehirList.delete(deleteKey);
                    }
                    break;

                case 7:
                    sehirList.delete();
                    System.out.println("Tüm Şehirler Silindi.");
                    break;

                case 8:
                    System.out.println("Programdan çıkılıyor...");
                    tarayici.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        }
    }
}

