package com.company;

import java.io.*;
import java.util.Stack;

public class DeCrypteMonfichir {
    public static String StringStackToString(Stack<String> list) {
        String result = "";
        for (String value : list) {
            result += value;
        }
        return result;
    }


    public static void DeCryptemonficher(double pin, int puk) throws IOException {
        long debut = System.currentTimeMillis();
        Stack liste = null;
        liste = new Stack();
        // Le fichier d'entrée
        File file = new File("Crypt.txt");
        // Créer l'objet File Reader
        FileReader fr = new FileReader(file);
        // Crier objet BufferedReader
        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        // Lire character par character
        while ((c = br.read()) != -1) {

            // converter l'entier en char
            char ch = (char) c;
            // Afficher le caractère


            String s = String.valueOf(ch);

            String result2 = CheckUpVitalPoint.UnCheckup(puk, s, pin);
            liste.push(result2);
            pin = pin + pin;



        }
        PrintWriter writer = new PrintWriter("file_decrypted.txt");
        writer.println(StringStackToString(liste));
        writer.close();
        System.out.println("Temps de Décryptage :");
        System.out.println(System.currentTimeMillis()-debut);
        System.out.println("ms !");
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
    }
}
