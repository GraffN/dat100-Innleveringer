package matriser;

import java.util.Arrays;

public class Matriser{

    // a)
    public static void skrivUt(int[][] matrise) {

        for (int i = 0; i < matrise.length; i++) {
            // length returns number of rows
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print( matrise[i][j]  + "\t");
            }
            System.out.println();
        }

    }


    // b)
    public static String tilStreng(int[][] matrise) {
        String streng = "";
        for(int i = 0; i < matrise.length; i++){
            for(int j = 0; j < matrise[i].length; j++){
                streng += matrise[i][j] + " ";
            }
            streng += "\n";
        }

        return streng;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] skalert = new int[matrise.length][matrise[1].length];
        for(int i = 0; i < matrise.length; i++){
            for(int j = 0; j < matrise[i].length; j++){
                skalert[i][j] += matrise[i][j] * tall;
            }
        }

        return skalert;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        boolean sjekkLik = false;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i] == b[i]){
                    sjekkLik = true;
                }else{
                    sjekkLik = false;
                }
            }
        }
        return sjekkLik;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        int[][] speilet = new int[matrise.length][matrise[1].length];
        for(int i = 0; i < matrise.length; i++){
            for(int j = 0; j < matrise[i].length; j++){
                speilet[matrise[i].length-i-1][matrise[j].length-j-1] += matrise[i][j];
            }
        }
        return speilet;

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("multipliser ikke implementert");

    }
}
