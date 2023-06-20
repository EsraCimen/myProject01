package alistirma;


import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) {
        String s ="Java isesasy";
        String b="";


        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                continue;

            }else {
               b+=s.charAt(i);

            }
        }
        System.out.println(b);
    }
}
