import java.util.Scanner;

public class ABCsehirlerineYolculuk {
    public static void main(String[] args) {
        /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Airlines...Please enter your route");
        String route =scanner.next().toUpperCase().trim().replaceAll("[^A-Za-z]","");

        System.out.println("Please enter '1' for an one way ticket , '2' for a return ticket");
        int direction = scanner.nextInt();

        System.out.println("Please enter your age");
        int age= scanner.nextInt();

        int km=0;
        double kmprice=0.1;

        switch (route){
            case "B": km=500;
               break;
            case "C":
                km=700;
                break;
            case "D":
                km=900;
                break;
            default:
                System.out.println("Please enter a valid route");
        }

        double price=km*kmprice;

        if (age<12){
            if (direction==1){
                price=price*0.5;
            } else if (direction==2) {
                price=price*0.5*0.8;
            }else
                System.out.println("Please enter a valid direction");
        } else if (age<25) {
            if (direction==1){
                price=price*0.9;
            } else if (direction==2) {
                price=price*0.9*0.8;
            }else
                System.out.println("Please enter a valid direction");

        } else if (age<65) {
            if (direction==1){
                price=price;
            } else if (direction==2) {
                price=price*0.8;
            }else
                System.out.println("Please enter a valid direction");
        }else{
            if (direction==1){
                price=price*0.7;
            } else if (direction==2) {
                price=price*0.7*0.8;
            }else
                System.out.println("Please enter a valid direction");
        }

        System.out.println("Your ticket from A city to "+route+" city. Your total price = "+price+" Have a good Journey as Airlines... Thank you for choosing us... See you soon");


    }
}
