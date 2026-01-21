public class Musteri {
    private int musteriNo;
    private String ad;
    private String soyad;
    private String eposta;
    private String telefon;
    private static int sonrakiMusteriNo=1;//Müşteri numaralarını otomatik olarak artırmak için kullanacağız.

    public Musteri( String ad, String soyad, String eposta, String telefon) {
        this.musteriNo = sonrakiMusteriNo;
        sonrakiMusteriNo++;
        this.ad=ad;
        this.soyad=soyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public static int getSonrakiMusteriNo() {
        return sonrakiMusteriNo;
    }

    public static void setSonrakiMusteriNo(int sonrakiMusteriNo) {
        Musteri.sonrakiMusteriNo = sonrakiMusteriNo;
    }

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSoyad(){
        return soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

   public String toString(){
        return "Müşteri No: "+ musteriNo+"\nAd: "+ ad+ "\nSoyad: "+ soyad+
                "\nE-Posta: "+ eposta+ "\nTelefon: "+telefon;
   }

   public boolean eslesmeKontrol(String anahtarKelime){
        if (ad.toLowerCase().contains(anahtarKelime.toLowerCase())
                ||soyad.toLowerCase().contains(anahtarKelime.toLowerCase()) ||
                eposta.toLowerCase().contains(anahtarKelime.toLowerCase())
                ||telefon.toLowerCase().contains(anahtarKelime.toLowerCase()))
        {
            System.out.println(this);
            return true;
        }
        return false;

   }

}
