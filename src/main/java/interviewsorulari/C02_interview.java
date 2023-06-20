package interviewsorulari;

import java.util.Scanner;

public class C02_interview {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please write something");
        String str = input.nextLine();

        boolean isthereSpace = str.contains(" ");
        System.out.println(isthereSpace);


    }
}
