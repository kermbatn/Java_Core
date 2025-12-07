package com.kerembatintopal;

import java.util.Scanner;

public class _6_Scanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name,surname;

        System.out.print("Lütfen Adınızı Giriniz: ");
        name= scanner.nextLine();

        System.out.print("Soyadınızı Giriniz");
        surname= scanner.nextLine();

        System.out.println("Adınız Ve Soyadınız: "+ (name+" "+surname));
    }
}
