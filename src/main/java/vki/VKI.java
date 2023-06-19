package vki;

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        /*Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

                IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


        BMI 18,5'in altındaysa zayıfsınız

        BMI 18,5 ile 25 arasında ise kilonuz idealdir

        BMI 25-30 arasındaysa şişmansınız

        BMI 30'dan büyük veya eşitse, obez/*
        
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double boy= input.nextDouble();

        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo = input.nextDouble();
        
        double bmi =kilo/(boy*boy);

        
        if (bmi<18.5){
            System.out.println(bmi+" zayifsiniz");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("kilonuz idealdir");
        } else if (bmi>=25&&bmi<30) {
            System.out.println("sismansiniz");
        }else {
            System.out.println("obezsiniz");
        }

        String bmi1= bmi<18.5 ? "zayifsiniz " :(bmi>=18.5 && bmi<25)?"kilonuz idealdir" :(bmi>=25&&bmi<30)? "sismansiniz" :"obezsiniz" ;
        System.out.println(bmi1);

    }
}
