package depo;

import java.util.*;


    public class Methodlar extends Urun {
        static HashMap<Integer,Urun>urunlerhm=new HashMap<>();
        static Scanner input = new Scanner(System.in);
        private static int globalId;


        public void urunTanimlama() {


            System.out.println("Kullanici eklemek istemiyorsaniz 0 i eklemeye devam etmek icin urun adini giriniz");
            do {
                Urun urun = new Urun();

                System.out.println("urunismi");
                urun.setUrunIsmi(input.next());
                System.out.println("uretici");
                urun.setUreticisi(input.next());
                System.out.println("miktar");
                urun.setMiktar(input.nextInt());
                urun.setId(++globalId);
                System.out.println("birim");
                urun.setBirim(input.next());
                System.out.println("raf");
                urun.setRaf(input.nextInt());

                urunlerhm.put(urun.getId(), urun);
                System.out.println("Urun ekleme islemini bırakmak icin 0 i devam etmek icin herhangi bir tusu tiklayiniz");
                if (input.next().equals("0")) {
                    break;

                }


            }
            while (true) ;
            System.out.println(urunlerhm);
        }
        public void urunListele(){
            System.out.println("URUNLER");
            System.out.println("__________________________");
            System.out.printf("%-5s %-11s %-10s %-6s %-7s %-2s %n","Id","Urun İsmi", "Ureticisi", "Miktar","Birim","Raf");
            System.out.println("_____________________________________");

            for (Urun w : urunlerhm.values()) {
                System.out.printf("%-5s %-11s %-10s %-6s %-7s %-2s %n",
                        w.getId(), w.getUrunIsmi(), w.getUreticisi(), w.getMiktar(), w.getBirim(), w.getRaf());
            }
            System.out.println("_____________________________________");

        }
        public void urunGirisi(){
            System.out.println("Lutfen degistirmek istediginiz urunun id sini giriniz");
            int id = input.nextInt();
            Urun urun =urunlerhm.get(id);
            System.out.println("Lutfen eklemek istediginiz degeri girin");
            int eklenecekDeger = input.nextInt();
            urun.setMiktar(urun.getMiktar()+eklenecekDeger);
            urunlerhm.put(id,urun);
            System.out.println(urunlerhm);



        }
        public void urunuRafaKoy(){
            System.out.println("Lutfen rafini degistirmek istediginiz urunun id sini giriniz");
            int id = input.nextInt();
            Urun urun =urunlerhm.get(id);
            System.out.println("Lutfen hangi rafa eklemek istediginizi giriniz");
            int degistirilecekRaf= input.nextInt();
            urun.setRaf(degistirilecekRaf);
            urunlerhm.put(id,urun);
            System.out.println(urunlerhm);
        }
        public void urunCikis(){
            System.out.println("Lutfen cikisini yapmak istediginiz urunun id sini giriniz");
            int id = input.nextInt();
            Urun urun =urunlerhm.get(id);
            System.out.println("Lutfen cikarmak istediginiz degeri girin");
            int cikilacakDeger = input.nextInt();
            urun.setMiktar(urun.getMiktar()-cikilacakDeger);
            urunlerhm.put(id,urun);
            System.out.println(urunlerhm);
        }
        public void anaMenu () {
            System.out.println("-------------------ANA MENU--------------------");
            System.out.println("" +
                    "\n" +
                    "\t     1- URUN TANIMLAMA\n" +
                    "\t     -----------------------\n" +
                    "\t     2- URUN LISTELEME\n" +
                    "\t     -----------------------\n" +
                    "\t     3- URUNLERI GIRISI\n" +
                    "\t     -----------------------\n" +
                    "\t     4- URUN RAFINI DEGISTIRME\n" +
                    "\t     -----------------------\n" +
                    "\t     5- URUN CIKISI\n" +
                    "\t     -----------------------\n" +
                    "\t     Q- PROGRAMI SONLANDIR\n");
            do {
                System.out.println("Lutfen Yapmak istediginiz islemi seciniz...");
                String tercih = input.next().toUpperCase();
                switch (tercih) {
                    case "1": //Urun tanımlamasi
                        urunTanimlama();

                        break;
                    case "2": //Urun Listeleme
                        urunListele();
                        break;
                    case "3": //Urun Girişi
                        urunGirisi();
                        break;
                    case "4": //Raf guncelleme
                        urunuRafaKoy();
                        break;
                    case "5":
                        urunCikis();
                        break;
                    case "Q":
                        System.out.println("Program sonlandirildi...");
                        break;
                    default:
                        System.out.println("Lutfen gecerli bir tercih giriniz...");
                }
                if (tercih.equalsIgnoreCase("Q")) {
                    break;
                }


            } while (true);
        }
    }



