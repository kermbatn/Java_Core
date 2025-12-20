package com.kerembatintopal;

public class _10_1_Method {

    //1) returnsuz ve parametresiz
    public static void returnsuzParametresiz() {
        System.out.println("returnsuz Parametresiz");

    }

    //2) returnsuz ve parametreli
    public static void returnsuzParametreli(String name,String surname){
        System.out.println("returnsuz Parametreli: "+name.concat(" ").concat(surname));
    }

    //3) returnlü ve parametresiz
    public static String returnluParametresiz(){
        return "returnlu Parametresiz";
    }

    //4) returnlü ve parametresiz
    public static int returnluParametreli(int number1, int number2){
        return number1*number2;
    }

    // PSVM
    static void main(){
        returnsuzParametresiz();
        returnsuzParametreli("Kerem","Topal");

        String data3 = returnluParametresiz();
        System.out.println(data3);

        int data4 = returnluParametreli(3,51);
        System.out.println(data4);
    }
}
