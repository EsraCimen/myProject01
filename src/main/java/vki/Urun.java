package vki;

import java.util.Scanner;

public class Urun {
    public static void main(String[] args) {
        /*

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz");
        double listeFiati= scan.nextDouble();

        System.out.println("Lutfen musteri kartinizin olup olmadigini evet yada hayir diyerek belirtiniz ");
        String musteriKartiVarMi=scan.next().toUpperCase();

        double indirim = musteriKartiVarMi.equals("EVET") ? (urunAdedi>10 ? urunAdedi*listeFiati*0.8  : urunAdedi*listeFiati*0.85) :
                (urunAdedi>10? urunAdedi*listeFiati*0.85 : urunAdedi*listeFiati*0.90) ;
        System.out.println(indirim);
    }
}
