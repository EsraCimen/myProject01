package ifelsesorulari;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your job  \nQuality Analyst icin qa \nDeveloper dev \nBusines Analyst ba \nProject Manager pm ");
        String job = scanner.nextLine();
        job = job.toLowerCase();

        if (job.equals("qa")) {
            System.out.println("Your job is Quality Analyst");
            System.out.println("Ihr Beruf ist Qualitätsanalytiker");
        } else if (job.equals("dev")) {
            System.out.println("Your job is Developer");
            System.out.println("Ihr Job ist Entwickler");
        } else if (job .equals("ba")) {
            System.out.println("Your job is Business Analyst");
            System.out.println("Ihr Job ist Business Analyst");
        } else if (job.equals("pm")) {
            System.out.println("Your job is Project Manager");
            System.out.println("Ihr Job ist Projektmanager");
        }else {
            System.out.println("Please enter a valid job");
            System.out.println("Bitte geben Sie einen gültigen Job ein");
        }
    }
}
