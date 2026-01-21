import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusteriYoneticisi {

    private ArrayList<Musteri>musteriListesi;


    private int maksimumBoyut;



    public MusteriYoneticisi(int maksimumBoyut) {
        this.maksimumBoyut = maksimumBoyut;
        musteriListesi = new ArrayList<>(maksimumBoyut);
    }

    public void musteriEkle(Musteri musteri){
        if (musteriListesi.size() < maksimumBoyut){
            musteriListesi.add(musteri);
            System.out.println("Müşteri başarıyla eklendi.");
        }else {
            System.out.println("Maksimum kapasiteye ulaşıldı. Yeni müşteri eklenemez.");
        }

    }




    public void musteriAra(String anahtarKelime){
        boolean bulundu = false;
        for (Musteri musteri : musteriListesi){
            bulundu = musteri.eslesmeKontrol(anahtarKelime) ;
        }
        if (!bulundu){
            System.out.println("Girilen müsteri bulunamadı.");
        }

    }
    public void musterileriSiralamaListele(){
        List<Musteri> musteriSiralama = new ArrayList<>(musteriListesi);
        musteriSiralama.sort(new Comparator<Musteri>() {
            @Override
            public int compare(Musteri o1, Musteri o2) {
                return Integer.compare(o1.getMusteriNo(), o2.getMusteriNo());
            }
        });
        for (Musteri musteri: musteriSiralama){
            System.out.println("Müşteri Numarası: " + musteri.getMusteriNo()+",Adı: "+
                    musteri.getAd()+", Soyadı:"+ musteri.getSoyad());
        }
    }

    public void musterileriListele(){
        for (Musteri musteri: musteriListesi){
            System.out.println(musteri.toString());
        }

    }

    public void musteriSil(int musteriNo){
        Musteri silinecekMusteri = null;
        for (Musteri musteri:musteriListesi){
            if (musteri.getMusteriNo() == musteriNo){
                silinecekMusteri = musteri;
                break;
            }
        }
        if (silinecekMusteri != null){
            musteriListesi.remove(silinecekMusteri);
            System.out.println("Müşteri başarıyla silindi.");
        }else
            System.out.println("Belirtilen müşteri bulunamadı.");

        }

    }


