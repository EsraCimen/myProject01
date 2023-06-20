package ifelsesorulari;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
         /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double height = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double weight = scanner.nextDouble();

        double bmi = weight/(height*height);

        if (bmi<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (20<bmi&&bmi<=25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (25<bmi&&bmi<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else System.out.println("Obez grubundasiniz.");
    }
}
