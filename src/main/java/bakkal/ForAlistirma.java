package bakkal;

import java.util.Scanner;

public class ForAlistirma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim =input.next();

        int sayac=0;

        System.out.println("Lutfen bir karakter giriniz");
        char ch =input.next().charAt(0);

        for (int i = 0; i < isim.length(); i++) {
            char ch1 = isim.charAt(i);
           if (ch1==ch){

               sayac++;
           }
        }
        System.out.println(ch +" sayisi = "+sayac);
    }
}
