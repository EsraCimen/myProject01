package day01_Variables;

public class C01_Variables {
    public static void main(String[] args) {
        //bir variable olustur, yazdir
        int yas =35;
        //syntax: variable data turu + variable ismi + atama operatoru + variable deger
        int sayi = 50;

        System.out.println(yas);//ctrl d ile satiri alt alta cogaltabiliriz
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);

        //sayyi =50 seklinde yazdir
        System.out.println("sayi = "+sayi);
        // sayi variable ini etiketiyle birlikte yazdirma

        // ctrl alt L == > kodlarimizi duzenlemeye yarar
        //bir variable i etiketiyle birlikte yazdirmanin kisa yolu soutv
        System.out.println("sayi = " + sayi);

        System.out.println("yas = " + yas);

        //string bir variable olusturalim -> non primitive bir data turu "" icinde yazilir, buyuk harfle baslar

        String isim= "Ali";
        //isim variableini etiketiyle yazdir
        System.out.println("isim = " + isim);

        //olusturugun bir variable'i farkli bir variable!a kopyala
        // yeni bir variable olusturacagim :benimYasim ve bu variable in degeri yas variablenin degerine esit olsun

        int benimYasim = yas;

        String onunIsmi=isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklare et
        int yil = 2023, ay =5, gun=15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        //bir variable degerini guncelle
        //az once olusturdugumuz isim variableinin degerini Veli olarak guncelle

        isim = "Veli";

        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Bir variable deklere et : x
        double x;
        //Bir variable baslat : y
        double y= 4.5;
        //Başka bir variable başlat : z
        double z = 3.2;
        //x degişkenini y degişkeni ile başlat
        x = y; // birvariable bir scopta(main metodta) yalniz bir defa deklare edilebilir
        //Variable y'i guncelle
        y=3.5;
        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        


    }
}
