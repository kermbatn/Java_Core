package com.kerembatintopal;

public class _9_1_String {
    static void main() {
        //string
        String value="java Öğreniyorum java";
        System.out.println(value);
        System.out.println("Boşluklu harf sayısı: "+value.length());
        System.out.println("Boşluksuz harf sayısı: "+value.trim().length());

        //manipulation
        value=value.trim();
        System.out.println("-ile başladı mı?: "+value.startsWith("j"));
        System.out.println("-ile bitti mi?: "+value.endsWith("a"));

        //küçük büyük karakter
        System.out.println("Hepsi küçük karakter: "+value.toLowerCase());
        System.out.println("Hepsi büyük karakter: "+value.toUpperCase());

        //System.out.println("ilk karakteri ver: "+value.indexOf(1));
        System.out.println("İlk harf karakteri ver: "+value.charAt(0));

        //Sayfaya sıfırdan başlar
        System.out.println("Baştan geçen ilk karakter indisi: "+value.indexOf("java"));
        System.out.println("Sondan geçen ilk karakter indisi: "+value.lastIndexOf("java"));

        System.out.println("Kelime değiştirme: "+value.replace("java","spring"));
        System.out.println("Benzersiz parmak izi: "+value.hashCode());
        System.out.println("Alt dizgi göster: "+value.substring(3));
        System.out.println("Alt dizgi göster: "+value.substring(0,6)); //0<=VALUE<=6-1
        System.out.println("Boş mu?: "+value.isEmpty());
    }
}
