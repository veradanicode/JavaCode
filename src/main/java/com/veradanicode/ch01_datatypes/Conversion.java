package com.veradanicode.ch01_datatypes;

public class Conversion {
    public static void main(String[] args) {
        //datatype casting

        //convert int to a double
        int i =123456789;
        double d =(double) i;
        System.out.println(d);

        //convert a long to a float
        long num1 =12385730;
        float floatnum=(float)num1;
        System.out.println(floatnum);

        //convert float into a long
        float f1=1.238573E7f;
        long l1 =(long)f1;
        System.out.println(l1);

        //convert float into a int
        float e1=1.238573E7f;
        int o1 =(int) e1;
        System.out.println(o1);


        //Wrapper class conversion
        int s =123456789;
        double newd=Integer.valueOf(s).doubleValue();
        System.out.println(newd);

        //Wrapper long to a float
        long l2=123456789;
        float r4 =Long.valueOf(l2).floatValue();
        System.out.println(r4);

        //autoboxing(conv primitive type to reference type using )
        int i5=42;
        Integer i6 =i5; //autoboxing

        //unboxing(conv primitive type to reference type using Integer datatype)

        Integer i2=Integer.valueOf(42);
        int iw=i2.intValue();
        System.out.println(iw);


    }
}
