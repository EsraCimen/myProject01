package ifelsesorulari;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık

        int islem = scan.nextInt();

        System.out.println("Lutfen islem yapmak istediginiz iki sayiyi giriniz");
        double num1 =scan.nextDouble();
        double num2 = scan.nextDouble();

        if (islem==1) {
            System.out.println("num1 + num2 = " + (num1 + num2));
        } else if (islem==2) {
            System.out.println("num1-num2 = " +( num1 - num2));
        } else if (islem==3) {
            System.out.println("num1/num2 = " + (num1 / num2));
        }else if (islem==4){
            System.out.println("num1*num2 = " + (num1 * num2));
        }else {
            System.out.println("Lutfen gecerli bir islem numarasi tuslayiniz");
        }
    }
}
