package com.veradanicode.ch01_datatypes;

public class ConversionAssignment {
    public static void main(String[] args) {

        //convert byte and char
        System.out.println("********************************CONVERSION FOR BYTE*****************************************************");
        //convert byte to short
        byte a1=12;
        short new1=Byte.valueOf(a1).shortValue();
        System.out.println("Converting byte to short using wrapper class conv: "+((Object) new1).getClass().getName());

        //convert byte to int
        byte byteToInt=123;
        int newInt=(int) byteToInt;
        System.out.println("Converting byte to int using type casting conv: "+((Object) newInt).getClass().getName());

        //convert byte to long
        byte byteToLong=70;
        long newLong=(long) byteToLong;
        System.out.println("Converting byte to long using type casting conv: "+((Object)newLong).getClass().getName());

        //convert byte to float
        byte byteToFloat=123;
        float newFloat=Float.valueOf(byteToFloat).floatValue();
        System.out.println("Converting byte to float using wrapper class conv: "+((Object) newFloat).getClass().getName());

        //convert byte to double
        byte byteToDouble=127;
        double newDouble=Double.valueOf(byteToDouble).doubleValue();
        System.out.println("Converting byte to double using wrapper class conv: "+((Object) newDouble).getClass().getName());

        System.out.println("********************************CONVERSION FOR CHAR*****************************************************");
        //convert from char to int
        char charToInt='a';
        int newwInt=(int)charToInt;
        System.out.println("Converting char to int using datatype casting conv: "+((Object)newwInt).getClass().getName());

        //convert from char to long
        char charToLong='0';
        long newwLong=(long)charToInt;
        System.out.println("Converting char to long using datatype casting conv: "+((Object)newwLong).getClass().getName());

        //convert from char to float
        char charToFloat='0';
        float newwFloat=(float) charToInt;
        System.out.println("Converting char to float using datatype casting conv: "+((Object)newwFloat).getClass().getName());

        //convert from char to double
        char charTodouble='0';
        double newwDouble=Double.valueOf(charToInt).doubleValue() ;
        System.out.println("Converting char to double using wrapper class conv: "+((Object)newwDouble).getClass().getName());

    }
}
