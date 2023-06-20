package interviewsorulari;

import java.util.Scanner;

public class C01_interviewATM1 {

    static int bakiye =1000;
    static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("    ****    ");
        System.out.println("ATM'ye hos geldiniz  :-)    ");
        System.out.println("    ****    ");
        System.out.println("Menü : \nBakiye sorgulama : 1\nPara cekme : 2\nPara yatirma : 3\nCikis : 4 ");
        secim();
    }
    private static void secim(){
        System.out.print("yapacagınız işlemi seciniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatirma();
                break;
            case 4:
                cikis();
                break;
        }
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz = " +bakiye);
        System.out.println("Isleme devam etmek istiyorsaniz : 1 \n cikis icin :2 i tuslayiniz");
        int karar = scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
    }
    private static void paraCekme(){
        System.out.println("Cekmek istediginiz parayi giriniz");
        int cek = scan.nextInt();
        if (bakiye>cek) {bakiye-=cek ;}else System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir..");
        System.out.println("Isleme devam etmek istiyorsaniz : 1 \n cikis icin :2 i tuslayiniz");
        int karar = scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();

    }
    private static void paraYatirma(){
        System.out.println("Yatirmak istediginiz parayi giriniz");
        int yatir = scan.nextInt();
        bakiye+=yatir;
        System.out.println("Isleme devam etmek istiyorsaniz : 1 \n cikis icin :2 i tuslayiniz");
        int karar = scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
    }
    private static void cikis(){
        System.out.println("Cikisiniz guvenle yapilmistir bizi tercih ettiginiz icin tesekkür eder iyi gunler dileriz");
    }
}
