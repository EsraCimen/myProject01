package bakkal;

import java.util.Scanner;

public class Alistirma2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

	Beklenen Cikti:

30 ve 40 icin GCD(ebob) = 10

30 ve 40 icin LCM(ekok) = 120
         */

        Scanner scn =new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tam sayi giriniz");
        int a =scn.nextInt();
        int b = scn.nextInt();

        int ebob =1;

        for(int i = 2;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob = " +ebob);
        int ekok =a*b/ebob;//ekok formulu sayilar carpimi / ebob
        System.out.println("ekok= "+ekok);
    }
}
