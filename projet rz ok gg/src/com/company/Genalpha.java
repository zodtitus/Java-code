package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Genalpha {


    public static ArrayList<String> genalpha(ArrayList<String> ar, double scint) {
        //Ma liste

        ArrayList<String> yo = new ArrayList<String>();
        //scanner simple
        String valeurDeSortie = "";
        double maxima = 479001600;

        double baserota = 39916800; // nombre de rotation nécéssaire au changement

        double result = scint / baserota; // on divise le nombre de la ligne que l'on cherche par le nombre de rotation nésséssaire au changement de la première lettre


        int i = Eltransformator.revoitmoitout(result);//transforme un double en int sans arrondir
        double j = result;


        String resultat = "";
        int nbDeRotation = i;
        if(nbDeRotation >= ar.size()){
            double vartemp = nbDeRotation;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();



            }

            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(nbDeRotation); }//int = 5

        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;

        ar.remove((valeurDeSortie)); //on supprime la lettre de la liste



        j = Eltransformator.viremoica(j, Eltransformator.revoitmoitout(j)); //

        j *= (1.0/11.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        yo.add(valeurDeSortie);

        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));


        j *= (1.0/10.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));


        j *= (1.0/9.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));



        j *= (1.0/8.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));


        j *= (1.0/7.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);




        j *= (1.0/6.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));



        j *= (1.0/5.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//


        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));




        j *= (1.0/4.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);



        j *= (1.0/3.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//



        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        ar.remove((valeurDeSortie));
        yo.add(valeurDeSortie);



        j *= (1.0/2.0)*100;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();


            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//



        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        resultat = resultat + valeurDeSortie;
        yo.add(valeurDeSortie);
        ar.remove((valeurDeSortie));


        j *= 0;

        i =  Eltransformator.revoitmoitout(j);


        if(i >= ar.size()){
            double vartemp = i;
            while (vartemp>= ar.size()){
                if(vartemp>(ar.size()*100000)){
                    vartemp= vartemp-(ar.size()*10000);
                }
                if(vartemp>(ar.size()*1000)){
                    vartemp= vartemp-(ar.size()*100);
                }
                vartemp= vartemp-ar.size();

            }
            valeurDeSortie = "" +(ar.get(Eltransformator.revoitmoitout(vartemp))); // exemple a b c d e f g si 82 / 5 = 16.2  manque une parenthèse

        }else { valeurDeSortie=""+ar.get(i); }//

       ;
        j = Eltransformator.viremoica(j,Eltransformator.revoitmoitout(j));
        yo.add(valeurDeSortie);
        resultat = resultat + valeurDeSortie;


        return yo;
    }
}