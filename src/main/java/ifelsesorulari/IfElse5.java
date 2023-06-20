package ifelsesorulari;

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();

        if (age<=18){
            System.out.println("Candidate is not allowed to donate blood");
        } else {
            if (weight>=50){
                System.out.println("Candidate is allowed to donate blood");
            }else {
                System.out.println("Candidate is not allowed to donate blood");
            }}
    }
}
