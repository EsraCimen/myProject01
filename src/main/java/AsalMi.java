package alistirma;

import java.util.Scanner;

public class AsalMi {
    // Bir sayının asal olup olmadığını kontrol eden bir metod
    public static boolean isPrime(int sayi) {
        // 2'den n-1'e kadar olan sayılara bölünüp bölünmediğine bakılır
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                // Tam bölünürse asal değildir
                return false;
            }
        }
        // Tam bölünmezse asaldır
        return true;
    }

    public static void main(String[] args) {
        // Kullanıcıdan bir sayı almak için Scanner sınıfından bir nesne oluşturulur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Bulunan asal sayıların sayısını tutmak için bir değişken tanımlanır
        int count = 0;

        // Sayıdan büyük ilk 10 asal sayıyı bulmak için bir döngü başlatılır
        while (count < 10) {
            // Sayının asal olup olmadığı kontrol edilir
            if (isPrime(number)) {
                // Asalsa ekrana yazdırılır ve bulunan asal sayıların sayısı bir arttırılır
                System.out.print(number+", ");
                count++;
            }
            // Sayı bir arttırılır ve döngü devam eder
            number++;
        }
    }
}

