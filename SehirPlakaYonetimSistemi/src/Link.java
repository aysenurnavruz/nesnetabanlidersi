public class Link {
    public Sehir sehir;
    public Link next;
    public Link previous;

    public Link(Sehir sehir){
        this.sehir=sehir;
    }

    public void displayLink(){
        System.out.println("Plaka Numarası: " + sehir.plakaNo);
        System.out.println("Şehir Adı: " + sehir.sehirAd);
        System.out.println("Nüfus: "+ sehir.nufus);

    }
}
