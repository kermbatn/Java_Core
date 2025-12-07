package com.kerembatintopal;

public class _7_2_Conditional_Ternary {
    static void main() {

        //1. YOL
        /* int number= 6;
        if(number<0){
            System.out.println("Sayı negatiftir");
        }else {
            System.out.println("Sayı pozitiftir");
        } */

        //2.YOL
        int number=6;
        String result = (number < 0)? "Sayı negatiftir" : "Sayı pozitiftir";
        System.out.println(result);
    }
}
