package forloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String sentence = input.nextLine();

       String word [] = sentence.split(" ");

        String longestWord="";


    }
}
