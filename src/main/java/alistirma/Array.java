package alistirma;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    /*
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

```
Test Data:
```

```
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
     */

    public static void main(String[] args) {

        String prog[] = {"PHP", "C Programming", "C#", " C++", "Java", "Python"};
        Arrays.sort(prog);
        System.out.println(Arrays.toString(prog));//[1022, 1134, 1232, 2345]



    /*
    Array deki sayıları tolpayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

```
Beklenen Çıktı:
```

```
Array toplamı: 55
     */

        int sayilar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam=0;

        for (int w:sayilar) {
            toplam +=w;
        }
        System.out.println(toplam);//55

        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

```
Beklenen Çıktı:
```

```
Array Sayılarının ortalaması: 7.0
```
         */

        int nums []= {20, 30, 25, 35, -16, 60, -100 };

        int sum =0;

        for (int w:nums) {
           sum +=w;
        }
        double ort =sum/nums.length;
        System.out.println(ort);

        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

```
Beklenen Çıktı:
```

```
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scan.nextInt();

        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j <=satir; j++) {
                System.out.print("0 ");
            }
            System.out.println();






        }

    }
}
