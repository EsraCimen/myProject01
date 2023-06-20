package hashmaphomework;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapHomework {
    //HomeWork
    //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
    //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    public static void main(String[] args) {
        String s="Hello Henry!";
        s=s.replaceAll("[^a-zA-Z]","");
        String []letters =s.split("");
        System.out.println(Arrays.toString(letters));//[H, e, l, l, o, H, e, n, r, y]

        HashMap<String,Integer> howManyLetter =new HashMap<>();

        for (String w:letters) {
           Integer numOfElement =howManyLetter.get(w);
            if (numOfElement==null){
                howManyLetter.put(w,1);
            }else {
                howManyLetter.put(w,numOfElement+1);
            }

        }
        System.out.println(howManyLetter);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}
    }


}
