package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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







        String valeurDeSortie = "";
        System.out.println("tape le nombre de ligne que tu veux calculé");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        float maxima=479001600;
        float baserota=39916800;
        int scint=Integer.parseInt(str);
        double result = scint/baserota;
        System.out.println(result);

        int i = Eltransformator.revoitmoitout(result);
        double j =  result;
        System.out.println(i);

        String ligne = "";
        String resultat = "";
        valeurDeSortie="";
        int nbDeRotation = i ;
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }

        System.out.println(resultat);
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));


        j *= (1.0/11.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        valeurDeSortie="";
        nbDeRotation = i ;
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));








        j *= (1.0/10.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));




        j *= (1.0/9.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie="";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));

        j *= (1.0/8.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));





        j *= (1.0/7.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));


        j *= (1.0/6.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));

        j *= (1.0/5.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
         valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));


        j *= (1.0/4.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));

        System.out.println(resultat);


        j *= (1.0/3.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));

        System.out.println(resultat);



        j *= (1.0/2.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
            valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));




        j *= 0;

        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);
        nbDeRotation = i;
        valeurDeSortie = "";
        while (nbDeRotation > 1){ //Tant qu'il y a des rotation...
            for (String word : ar) { //... il parcours ton tableau.
                if (nbDeRotation > 0){ // Si il est a cours de rotation durant sa boucle...
                    valeurDeSortie = word;

                    nbDeRotation--;
                }else { // ... il quitte la boucle.
                    break;
                }
            }
        }
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);



    }
}
