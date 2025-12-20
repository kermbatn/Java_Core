package com.kerembatintopal;

public class _11_Array {
    static void main() {
        //instance(örnerkleme)
        String[] city = new String[6];
        city[0]="Malatya";
        city[1]="Elazığ";
        city[2]="Bingöl";
        city[3]="Ankara";
        city[4]="İstanbul";
        city[5]="Sivas";

        System.out.println("Eleman sayısı: "+city.length);
        System.out.println("İlk eleman: "+city[0]);
        System.out.println("Son eleman: "+city[city.length-1]);

        //clone
        String[] cityClone= city.clone();
        System.out.println(cityClone[0]);
        //city=cityClone;
        System.out.println("== FOR INDEX=====");
        for (int i = 0; i <=cityClone.length-1 ; i++) {
            System.out.print(cityClone[i]+" ");
        }

        //For Each
        System.out.println("\n\n==== FOR EACH ====");
        for (String temp:cityClone) {
            System.out.println(temp + " ");
        }

    }
}
