
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner fiyat = new Scanner (System.in);

        //Degişkenler
        float kdvsizFiyat, kdvliFiyat, kdvOrani1 = 0.18f, kdvTutari;

        //Kullanıcıdan ürünün fiyat bilgisi
        System.out.print("KDV'siz fiyat giriniz :");
        kdvsizFiyat = fiyat.nextFloat();

        //KDV Tutari hesaplama
        kdvTutari = (kdvsizFiyat*kdvOrani1);

        //KDV'li fiyat hesaplama
        kdvliFiyat = kdvTutari + kdvsizFiyat;


        //Ürünün KDV'siz fiyatini, KDV oranini, KDV tutarini, KDV'li fiyatini ekrana yazdirma
        System.out.println("Urunun KDV'siz fiyati :" + kdvsizFiyat);
        System.out.println("KDV Oranı:" + kdvOrani1);
        System.out.println("KDV Tutari :" + kdvTutari );
        System.out.println("Urunun KDV'li fiyati :" + kdvliFiyat);


    }
}