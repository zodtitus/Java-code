package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Genalpha {


    public static ArrayList<String> genalpha(ArrayList<String> ar) {
        //Ma liste

        ArrayList<String> yo = new ArrayList<String>();
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
        if(nbDeRotation >= ar.size()){
            double vartemp = nbDeRotation;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }

            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(nbDeRotation); }//int = 5

        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;
        System.out.println(resultat);
        ar.remove((valeurDeSortie)); //on supprime la lettre de la liste



        j = Eltransformator.viremoica(j, Eltransformator.revoitmoitout(j)); //

        j *= (1.0/11.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        yo.add(valeurDeSortie);
        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/10.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= (1.0/9.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/8.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//
        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= (1.0/7.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);
        System.out.println(resultat);



        j *= (1.0/6.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));
        System.out.println(resultat);


        j *= (1.0/5.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));
        System.out.println(resultat);



        j *= (1.0/4.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//
        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);
        System.out.println(resultat);


        j *= (1.0/3.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);
        System.out.println(resultat);



        j *= (1.0/2.0)*100;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));
        System.out.println(resultat);

        j *= 0;
        System.out.println(j);
        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        System.out.println(resultat);
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        System.out.println(resultat);
        return yo;
    }
}