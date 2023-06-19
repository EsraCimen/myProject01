package proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        List<User> users =new ArrayList<>();
        System.out.println("Kullanici eklemek istemiyorsaniz 0 i eklemeye devam etmek icin her hangi bir tusa basiniz");
        do {
            User user=new User();
            System.out.println("Kullanici ismi giriniz");
            user.setUserName(scan.next());
            System.out.println("Lutfen passwordunuzu giriniz");
            user.setPassword(scan.next());
            Random rand = new Random();
            int id = rand.nextInt(999999999) + 1;
            user.setId(id);
            users.add(user);

            if (scan.next().equals("0")){
                break;

            }
        }while (true);
        System.out.println(users);


    }
}
