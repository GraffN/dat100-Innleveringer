package tabeller;

public class Tabeller {

    // oppgave 1 A
    public static void skrivUt (int[] tabell){
        for(int i = 0; i < tabell.length; i++){
            System.out.printf("tall %s: %s", i,tabell[i]);
        }
    }
    //oppgave 1 B
    public static String tilStreng (int[] tabell){
        String string_tabell = "";
        for(int i = 0; i < tabell.length; i++){
            if(i == 0){
                string_tabell = String.valueOf(tabell[i]);
            } else {
                string_tabell = string_tabell +"," + String.valueOf(tabell[i]);
            }
        }
        return "["+string_tabell+"]";
    }
    //oppgave 1C 1 for løkke
    public static int summer (int[] tabell){
        int sum = 0;
        for(int i = 0; i < tabell.length; i++){
            sum += tabell[i];
        }
        return sum;
    }
    //oppgave 1C 2 While løkke
    public static int summerWhile (int[] tabell){
        int i = 0;
        int sum = 0;
        while(i < tabell.length){
            sum += tabell[i];
            i++;
        }
        return sum;
    }
    //oppgave 1c 3 utvidet for løkke
    public static int summerForOf(int[] tabell){
        int sum = 0;
        for( int x : tabell){
            sum += x;
        }
        return sum;
    }
    //oppgave 1d
    public static boolean finnesTall (int[] tabell, int tall){
        boolean finnes = false;
        for(int x : tabell){
            if(x == tall){
                finnes = true;
                break;
            }
        }
        return finnes;
    }
    //oppgave 1e
    public static int posisjonTall (int[] tabell, int tall){
        int posisjon = -1;
        for(int i = 0; i < tabell.length; i++){
            if(tabell[i] == tall){
                posisjon = i;
            }
        }
        return posisjon;
    }
    //oppgave 1f
    public static int[] reverser(int[] tabell){
        int[] revers = new int[tabell.length];
        for(int i = 0; i < tabell.length; i++){
            revers[i] = tabell[tabell.length-1-i];
        }
        return revers;
    }
    //oppgave 1g
    public static boolean erSortert (int[] tabell){
        boolean sortert = true;
        int i = 0;
        while(sortert && i < tabell.length-1){
            if(tabell[i] > tabell[i+1]){
                sortert = false;
            }
            i++;
        }
        return sortert;
    }
    //oppgave 1h
    public static int[] settSammen(int[] tabell1,int[] tabell2){
        int[] sammen = new int[tabell1.length + tabell2.length];

        for (int i = 0; i < sammen.length; i++) {
            if (i < tabell1.length) {
                sammen[i] = tabell1[i];
            } else {
                sammen[i] = tabell2[i - tabell1.length];
            }
        }

        return sammen;
        }


}
