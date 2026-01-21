
public class Main {
    public static void main(String[] args) {
        /*sıralı diziler elmanları küçükten büyüğe veya büyükten küçüğe sırlamamızı sağlayacak bir dizi. ordered arrays.
        * sıralı listeler bize ekleme dışında çok büyük faydalar sağlar!
        * arama iki şekilde yapılır  1. linear search (doğrusal arama) 2. ikili arama (binary search)
        * doğrusal arama herhangi bir sırasız dizi ile aynıdır.
        * büyük listelerde doğrusal arama kötü bir tercih olur aynı işlemi ikili arama ile yapparsan daha kolay ve daha kısa zamadna bulursun aradığın şeyi.
         */

        int maxSize = 100;
        OrderedArray dizi = new OrderedArray(maxSize);
        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(22);
        dizi.insert(11);
        dizi.insert(81);
        dizi.insert(88);
        dizi.insert(33);
        dizi.display();

        dizi.delete(13);
        dizi.display();
        System.out.println(dizi.size());


    }
}