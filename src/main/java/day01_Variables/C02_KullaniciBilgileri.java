package day01_Variables;

public class C02_KullaniciBilgileri {
    public static void main(String[] args) {
         /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

        String isim = "Ayse";
        String soyisim= "Cetin";
        int yas = 23;
        double boy =170;
        double kilo=65.5;
        System.out.println("Isim : " + isim +
                "\nSoyisim : " +soyisim +
                "\nYas = : " + yas +
                "\nBoy : " + boy +
                "\nKilo : " + kilo
        );
    }
}
