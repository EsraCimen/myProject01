package for_loop;

import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {
        //baslangic ve bitis degerlerini kullanicidan al ve aradaki tum sayilari toplayan programi yaz
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini giriniz");
        int bas = scanner.nextInt();
        int bit =scanner.nextInt();
        int toplam =0;

        for (int i = bas; i <=bit ; i++) {
            toplam+=i;
        }
        System.out.println("Toplam : "+toplam);
    }
}
