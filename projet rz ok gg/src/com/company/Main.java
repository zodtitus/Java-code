package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Ma liste
        ArrayList<String> ar = new ArrayList<>();
        String s1 = "A";
        ar.add(s1);
        String s2 = "B";
        ar.add(s2);
        String s3 = "C";
        ar.add(s3);
        String s4 = "D";
        ar.add(s4);
        String s5 = "E";
        ar.add(s5);
        String s6 = "F";
        ar.add(s6);
        String s7 = "G";
        ar.add(s7);
        String s8 = "H";
        ar.add(s8);
        String s9 = "I";
        ar.add(s9);
        String s10 = "J";
        ar.add(s10);
        String s11 = "K";
        ar.add(s11);
        String s12 = "L";
        ar.add(s12);

    ArrayList<String> result =  Genalpha.genalpha(ar);
    String result2 = Crypt.Cryptmoica("A",ar,result);
    System.out.println(result2);
    System.out.println(result);
    }
}