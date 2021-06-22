package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void menu() throws IOException {
        Scanner sc=new Scanner(System.in);
        int rep3 = 0;
        double pin= 0;
        int puk=0;




        do
        {
            System.out.println("-------------------------Le Codeur Décodeur par Romain Zaragoza--------------------------");
            System.out.println("                   1.Crypter                                  ");
            System.out.println("               2.Décrypter                               ");
            System.out.println("Taper votre choix :                                       ");
            rep3=Integer.parseInt(sc.nextLine());
            switch(rep3)
            {
                case 1:
                    System.out.println("Veuillez taper votre code pin max input: 2147483647");
                     pin=Integer.parseInt(sc.nextLine());
                    System.out.println("Veuillez taper votre code puk max input: 2147483647");
                     puk=Integer.parseInt(sc.nextLine());
                    CrypteMonfichir.Cryptemonficher(pin, puk);
                    break;
                case 2:
                    System.out.println("Veuillez taper votre code pin");
                    pin=Integer.parseInt(sc.nextLine());
                    System.out.println("Veuillez taper votre code puk");
                     puk=Integer.parseInt(sc.nextLine());
                    DeCrypteMonfichir.DeCryptemonficher(pin, puk);
                    break;

                default:System.out.println("Veuillez respecter le menu!");
            }
        }while(rep3!=2);

    }
}
