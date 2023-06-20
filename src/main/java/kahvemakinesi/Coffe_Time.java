package kahvemakinesi;

import java.util.Scanner;

public class Coffe_Time {
    static Scanner scn =new Scanner(System.in);
    static String coffeSelection;
    static String milk;
    static  String sugar;
    static String size;
    static int sugarNum;


    public static void main(String[] args) {



        whichCoffee();
        addMilk();
        addSugar();
        size();


    }
    public static void whichCoffee() {
        do {System.out.println("Welcome to Coffee Time Maschine...\n" +
                "Would you like which coffee?\n" +
                "1.Turkish coffee\n" +
                "2.Filter coffee \n" +
                "3.Espresso ");
            Scanner scn=new Scanner(System.in);
            String coffeeSelection = scn.nextLine().toLowerCase();
            switch (coffeeSelection) {
                case "turkish coffee":
                    System.out.println("turkish coffee is preapering..");
                    return;
                case "filter coffee":
                    System.out.println("filter coffee is preapering..");
                    return;
                case "espresso":
                    System.out.println("espresso is preapering...");
                   return;
                default:
                    System.out.println("Please enter valid coffee name");
                    whichCoffee();
            }

        } while (true);


    }

    public static void addMilk(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Would you like some milk? yes or no");
        String milk = scn.nextLine().toLowerCase();
        if (milk.equals("yes")){
            System.out.println("coffee is preapering with milk...");

        }else if (milk.equals("no")) {
            System.out.println("Coffee is preapering without milk");
        }else {
            System.out.println("You enter invalid selection \n Would you like some milk? enter yes or no");
            addMilk();
        }

    }

    public static void addSugar (){
        System.out.println("Would you like some sugar? yes or no");
        String sugar= scn.next().toLowerCase();
        if (sugar.equals("yes")){
            System.out.println("How many sugar want to ?");
            scn.nextLine();
            int sugarNum= scn.nextInt();
            System.out.println("Coffee is preaparing as with "+sugarNum+" sugar");
            } else if (sugar.equals("no")) {
            System.out.println("Coffee is preapering as without sugar");
        } else {
            System.out.println("Please enter valid selection");
            addSugar();
            }


    }
    public static void size(){
        System.out.println("What size do you want the coffee in? 1.Tall 2.Regular 3.Short");
        size=scn.next().toLowerCase();
        if (size.equals("tall")) {
            System.out.println("Coffee is preapering as tall size...Bon Apetit :)");
        } else if (size.equals("regular")) {
            System.out.println("Coffee is preapering as regular size...Bon Apetit :)");
        } else if (size.equals("short")) {
            System.out.println("Coffee is preapering as short size...Bon Apetit :)");
        }else {
            System.out.println("Please enter valid size");
            size();
        }


    }






}
