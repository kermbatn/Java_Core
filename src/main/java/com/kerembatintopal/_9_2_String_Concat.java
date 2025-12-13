package com.kerembatintopal;

public class _9_2_String_Concat {
    static void main() {
        //String
        String value1="java";
        String value2="spring";
        String value3="database";
        String value4="frontend";

        //YOL-1 minus
        System.out.println("1-Birleştirmek: "+(value1+value2+value3+value4));

        //YOL-2 concat
        System.out.println("2-Birleştirmek: "+(value1.concat(value2).concat(value3).concat(value4)));

        //YOL-3
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3-Birleştirmek: ").append(value1).append(value2).append(value3).append(value4);
        String data= stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}
