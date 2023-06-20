package forloops;

public class UcgenOlusturma {
    public static void main(String[] args) {
        /*for loop kullanarak ucgen olusturun
             *
            * *
           * * *
          * * * *
         * * * * *



         */



        int satir =5;
        for (int i = 1; i <=satir ; i++) {
            //Spaceler icin Loop
            for (int j = satir-1; j >=i; j--) {
                System.out.print(" ");
            }
            //* icin for loop
            for (int m = 1; m <=i; m++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("-----------");

        //yukaridaki seklin tersini olustur

        for (int i = 1; i <=satir ; i++) {

            //spaceler icin
            for (int m =1; m <=i ; m++) {
                System.out.print(" ");
            }
            //yildizlar icin
            for (int j = satir; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
