package com.company;

import java.util.ArrayList;

public class Crypt {
    public static String Cryptmoica(String b, ArrayList<String> ar, ArrayList<String> alpha) {



        int pos=alpha.indexOf(b);
        String res = ar.get(pos);
        return res;

    }
    public static String Decryptmoica(String b, ArrayList<String> ar, ArrayList<String> alpha) {

        int pos= ar.indexOf(b);
        if(ar.indexOf(b)== -1){System.out.println ("ERROR ERROR ");}
        String res = alpha.get(pos);
        return res;

    }

}
