package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {

        //Width of an int is 32 (4 bytes)
        int myInt = 5 /3;
        //Width of a float is 32 (4 bytes)
        float myFloat = 5f / 3f;
        //Width of a double is 64 (8 bytes)
        double myDouble = 5d / 3d;

        System.out.println("Int= " + myInt);
        System.out.println("Float= " + myFloat);
        System.out.println("Double= " + myDouble);

        double pounds = 25d;
        double kilos = pounds * 0.45359237d;

        System.out.println(pounds + " pounds in kilos is " + kilos);
    }
}
