package bakkal;

import java.util.Arrays;
import java.util.Scanner;

public class Bakkal {
    public static void main(String[] args) {
        String gunler[]={"Pazartesi","Sali", "Carsamba", "Persembe","Cuma" ,"Cumartesi", "Pazar"};
        int gunlukKazanc [] =new int [7];
        int idx =0;
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen gunluk kazancınızı giriniz");
        int kazanc = input.nextInt();
        while (idx>8){

           idx =idx+ gunlukKazanc [idx] ;
            idx++;

        }
        System.out.println(Arrays.toString(gunlukKazanc));

    }
}
