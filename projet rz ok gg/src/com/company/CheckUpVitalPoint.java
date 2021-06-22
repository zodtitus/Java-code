package com.company;

import java.util.ArrayList;

public class CheckUpVitalPoint {
    public static String Checkup(int puk, String a, Double pin) {
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
        ArrayList<String> debug = new ArrayList<>();
        debug.add(s1);
        debug.add(s2);
        debug.add(s3);
        debug.add(s4);
        debug.add(s5);
        debug.add(s6);
        debug.add(s7);
        debug.add(s8);
        debug.add(s9);
        debug.add(s10);
        debug.add(s11);
        debug.add(s12);

        ArrayList<String> ar2 = new ArrayList<>();
        String e1 = "M";
        ar2.add(e1);
        String e2 = "N";
        ar2.add(e2);
        String e3 = "O";
        ar2.add(e3);
        String e4 = "P";
        ar2.add(e4);
        String e5 = "Q";
        ar2.add(e5);
        String e6 = "R";
        ar2.add(e6);
        String e7 = "S";
        ar2.add(e7);
        String e8 = "T";
        ar2.add(e8);
        String e9 = "U";
        ar2.add(e9);
        String e10 = "V";
        ar2.add(e10);
        String e11 = "W";
        ar2.add(e11);
        String e12 = "X";
        ar2.add(e12);
        ArrayList<String> debug2 = new ArrayList<>();
        debug2.add(e1);
        debug2.add(e2);
        debug2.add(e3);
        debug2.add(e4);
        debug2.add(e5);
        debug2.add(e6);
        debug2.add(e7);
        debug2.add(e8);
        debug2.add(e9);
        debug2.add(e10);
        debug2.add(e11);
        debug2.add(e12);
        ArrayList<String> ar3 = new ArrayList<>();
        String f1 = "Y";
        ar3.add(f1);
        String f2 = "Z";
        ar3.add(f2);
        String f3 = "1";
        ar3.add(f3);
        String f4 = "2";
        ar3.add(f4);
        String f5 = "3";
        ar3.add(f5);
        String f6 = "4";
        ar3.add(f6);
        String f7 = "5";
        ar3.add(f7);
        String f8 = "6";
        ar3.add(f8);
        String f9 = "7";
        ar3.add(f9);
        String f10 = "8";
        ar3.add(f10);
        String f11 = "9";
        ar3.add(f11);
        String f12 = "0";
        ar3.add(f12);
        ArrayList<String> debug3 = new ArrayList<>();
        debug3.add(f1);
        debug3.add(f2);
        debug3.add(f3);
        debug3.add(f4);
        debug3.add(f5);
        debug3.add(f6);
        debug3.add(f7);
        debug3.add(f8);
        debug3.add(f9);
        debug3.add(f10);
        debug3.add(f11);
        debug3.add(f12);
        if(a.equals(" ")){
            return a;
        }
        if (puk < 1666) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Cryptmoica(a, result,debug );
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Cryptmoica(a, result, debug2);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Cryptmoica(a, result, debug3);
                return result2;

            }

        }
        if (puk > 1666 && puk < 3333 ) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Cryptmoica(a, result, debug);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Cryptmoica(a, result, debug2);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Cryptmoica(a, result, debug3);
                return result2;

            }
        }

            if (puk > 3333 && puk < 4999 ) {
                if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                    ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                    String result2 = Crypt.Cryptmoica(a, result, debug);
                    return result2;


                }
                if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                    ArrayList<String> result = Genalpha.genalpha(ar, pin);
                    String result2 = Crypt.Cryptmoica(a, result, debug2);
                    return result2;

                }
                if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                    ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                    String result2 = Crypt.Cryptmoica(a, result,debug3);
                    return result2;

                }
            }
                if (puk > 4999 && puk < 6665 ) {
                    if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                        ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                        String result2 = Crypt.Cryptmoica(a, result, debug);
                        return result2;


                    }
                    if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                        ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                        String result2 = Crypt.Cryptmoica(a, result, debug2);
                        return result2;

                    }
                    if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                        ArrayList<String> result = Genalpha.genalpha(ar, pin);
                        String result2 = Crypt.Cryptmoica(a, result, debug3);
                        return result2;

                    }
                }
                    if (puk > 6665 && puk < 8331 ) {
                        if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                            ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                            String result2 = Crypt.Cryptmoica(a, result, debug);
                            return result2;


                        }
                        if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                            ArrayList<String> result = Genalpha.genalpha(ar, pin);
                            String result2 = Crypt.Cryptmoica(a, result, debug2);
                            return result2;

                        }
                        if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                            ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                            String result2 = Crypt.Cryptmoica(a, result, debug3);
                            return result2;

                        }
                    }
                        else {
                        if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                            ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                            String result2 = Crypt.Cryptmoica(a, result, debug);
                            return result2;


                        }
                        if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                            ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                            String result2 = Crypt.Cryptmoica(a,result, debug2);
                            return result2;

                        }
                        if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                            ArrayList<String> result = Genalpha.genalpha(ar, pin);
                            String result2 = Crypt.Cryptmoica(a, result, debug3);
                            return result2;

                        }
                    }


       return a; }
    public static String UnCheckup(int puk, String a, Double pin) {
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
        ArrayList<String> debug = new ArrayList<>();
        debug.add(s1);
        debug.add(s2);
        debug.add(s3);
        debug.add(s4);
        debug.add(s5);
        debug.add(s6);
        debug.add(s7);
        debug.add(s8);
        debug.add(s9);
        debug.add(s10);
        debug.add(s11);
        debug.add(s12);

        ArrayList<String> ar2 = new ArrayList<>();
        String e1 = "M";
        ar2.add(e1);
        String e2 = "N";
        ar2.add(e2);
        String e3 = "O";
        ar2.add(e3);
        String e4 = "P";
        ar2.add(e4);
        String e5 = "Q";
        ar2.add(e5);
        String e6 = "R";
        ar2.add(e6);
        String e7 = "S";
        ar2.add(e7);
        String e8 = "T";
        ar2.add(e8);
        String e9 = "U";
        ar2.add(e9);
        String e10 = "V";
        ar2.add(e10);
        String e11 = "W";
        ar2.add(e11);
        String e12 = "X";
        ar2.add(e12);
        ArrayList<String> debug2 = new ArrayList<>();
        debug2.add(e1);
        debug2.add(e2);
        debug2.add(e3);
        debug2.add(e4);
        debug2.add(e5);
        debug2.add(e6);
        debug2.add(e7);
        debug2.add(e8);
        debug2.add(e9);
        debug2.add(e10);
        debug2.add(e11);
        debug2.add(e12);
        ArrayList<String> ar3 = new ArrayList<>();
        String f1 = "Y";
        ar3.add(f1);
        String f2 = "Z";
        ar3.add(f2);
        String f3 = "1";
        ar3.add(f3);
        String f4 = "2";
        ar3.add(f4);
        String f5 = "3";
        ar3.add(f5);
        String f6 = "4";
        ar3.add(f6);
        String f7 = "5";
        ar3.add(f7);
        String f8 = "6";
        ar3.add(f8);
        String f9 = "7";
        ar3.add(f9);
        String f10 = "8";
        ar3.add(f10);
        String f11 = "9";
        ar3.add(f11);
        String f12 = "0";
        ar3.add(f12);
        ArrayList<String> debug3 = new ArrayList<>();
        debug3.add(f1);
        debug3.add(f2);
        debug3.add(f3);
        debug3.add(f4);
        debug3.add(f5);
        debug3.add(f6);
        debug3.add(f7);
        debug3.add(f8);
        debug3.add(f9);
        debug3.add(f10);
        debug3.add(f11);
        debug3.add(f12);
        if(a.equals(" ")){
            return a;
        }
        if (puk < 1666) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result,debug );
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug3);
                return result2;

            }

        }
        if (puk > 1666 && puk < 3333 ) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result,debug3);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;

            }
        }

        if (puk > 3333 && puk < 4999 ) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug3);
                return result2;

            }
        }
        if (puk > 4999 && puk < 6665 ) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug3);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;

            }
        }
        if (puk > 6665 && puk < 8331 ) {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug3);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a,result, debug);
                return result2;

            }
        }
        else {
            if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F") || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K") || a.equals("L")) {
                ArrayList<String> result = Genalpha.genalpha(ar, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug3);
                return result2;


            }
            if (a.equals("M") || a.equals("N") || a.equals("O") || a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V") || a.equals("W") || a.equals("X")) {
                ArrayList<String> result = Genalpha.genalpha(ar2, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug2);
                return result2;

            }
            if (a.equals("Y") || a.equals("Z") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("0")) {
                ArrayList<String> result = Genalpha.genalpha(ar3, pin);
                String result2 = Crypt.Decryptmoica(a, result, debug);
                return result2;

            }
        }


        return a; }



    }
