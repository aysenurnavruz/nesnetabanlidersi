
public class Main {
    public static void main(String[] args) {
      long [] dizi= new long[100];
      int elemanSayisi=0;
      int j;
        long searchKey;
        //ekleme
        dizi[0]=77;
        dizi[1]=99;
        dizi[2]=44;
        dizi[3]=55;
        dizi[4]=22;
        dizi[5]=88;
        dizi[6]=11;
        dizi[7]=1;
        dizi[8]=66;
        dizi[9]=33;
        elemanSayisi=10;

        //yazdırma
        for ( j = 0; j <elemanSayisi; j++) {
            System.out.println(dizi[j]+" ");
        }
        //arama
        searchKey =99;
        for(byte i=0; i < elemanSayisi; i++){
            if (searchKey == dizi[i]){
                System.out.println("\nBulundu: " + searchKey);
                break;
            }
        }

        //silme
        //İlk döngüde silinmek istenen değerin indisini bulalım;

        searchKey = 55;//silmek istedğimiz değer.
        int indis;

        for(indis = 0; indis < elemanSayisi; indis++){
            if (dizi[indis] == searchKey)
                break;

        }

        //İteratif kaydırma işlemi yapalım.

        for (int i = indis; i <elemanSayisi ; i++) {
            dizi[i] = dizi[i+1];

        }
        elemanSayisi--;
        //silme işleminden sonra dizideki elemanlar;

        for ( j =0; j<elemanSayisi; j++)
            System.out.println(dizi[j] + " ");

        //yazdırma
        for (j =0; j<elemanSayisi; j++)
            System.out.println(dizi[j] + " ");
        System.out.println(" ");

        //arama ve silme
        searchKey = 44;
        for (j = 0; j<elemanSayisi; j++)
            if (dizi[j] == searchKey)
                break;
        for (int k = j; k < elemanSayisi; k++){
            dizi[k] = dizi[k+1];
            elemanSayisi--;}

        //yeni diziyi yazdırma

           for ( j=0; j<elemanSayisi;j++)
               System.out.println(dizi[j]+ " ");
        System.out.println(" ");
        System.out.println("Dizinin boyutu" + dizi.length);






    }
}