package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class CrypteMonfichir {
    public static String StringStackToString(Stack<String> list) {
        String result = "";
        for (String value : list) {
            result += value;
        }
        return result;
    }


    public static void Cryptemonficher(double pin, int puk) throws IOException {
        long debut = System.currentTimeMillis();
        Stack liste = null;
        liste = new Stack();

        File file = new File("file.txt");

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        double a  =0;
        // Lire character par character
        while((c = br.read()) != -1) {

            char ch = (char) c;


            String s=String.valueOf(ch);

            String result2 = CheckUpVitalPoint.Checkup(puk, s ,pin);
            liste.push(result2);
            pin = pin + pin;





        }
        if((int) a!= 100){
            System.out.println("100% ");
        }

        PrintWriter writer = new PrintWriter("Crypt.txt");
        writer.println(StringStackToString(liste));
        writer.close();
        System.out.println("" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" + "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "-------Succes-------");
        System.out.println("Temps de Cryptage :");
        System.out.println(System.currentTimeMillis()-debut);
        System.out.println("ms !");




    }
}
