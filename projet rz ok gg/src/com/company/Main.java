package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Ma liste
        ArrayList<String> ar = new ArrayList<String>();
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


        //scanner simple
        String valeurDeSortie = "";
        System.out.println("tape le nombre de ligne que tu veux calculé");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double maxima = 479001600;

        double baserota = 39916800; // nombre de rotation nécéssaire au changement
        int scint = Integer.parseInt(str); // on transforme la saisie en INT
        double result = scint / baserota; // on divise le nombre de la ligne que l'on cherche par le nombre de rotation nésséssaire au changement de la première lettre
        System.out.println(result);//debug

        int i = Eltransformator.revoitmoitout(result);//transforme un double en int sans arrondir
        double j = result;
        System.out.println(i);//debug

        String resultat = "";
        int nbDeRotation = i;
        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));


        resultat = resultat + valeurDeSortie;
        System.out.println(resultat);
        ar.remove((valeurDeSortie)); //on supprime la lettre de la liste



        j = Eltransformator.viremoica(j, Eltransformator.revoitmoitout(j));

        j *= (1.0/11.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/10.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= (1.0/9.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/8.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= (1.0/7.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);



        j *= (1.0/6.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/5.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);



        j *= (1.0/4.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/3.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);



        j *= (1.0/2.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= 0;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        valeurDeSortie = "" + (ar.get(nbDeRotation % ar.size()));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);
    }
}