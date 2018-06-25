package com.formation;

public class Main {
    //
    public static void main(String[] args) {
/////////////////////////////////////////////////////////////
        //int[] tab = {2, -2, 99, 88, 7, 13, 12, 10, 18, 22};//correction
        int[] tab = {2, 4, 99, 88, 7, 13, 12, 10, 18, 22};
        //System.out.println(isPrime(13));
        int[] primeTab = getPrimeNumbers(tab);
        for (int i = 0; i < primeTab.length; i++) {
            System.out.println(primeTab[i]);
        }
        //System.out.print(factorielle(13));

        tabFactorielle(primeTab);
        //for (int i = 0; i < factTab.length; i++) {
        // factTab[i]=
        // System.out.println(factTab[i]);
    }


    public static boolean isPrime(int n) {
        boolean result = true;
        if (n < 2) {
            result = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }//


    public static int[] getPrimeNumbers(int[] tab) {
        int[] result = new int[tab.length];
        int index = 0;
        for (int i : tab) {
            if (isPrime(i)) {
                result[index] = i;
                index++;
            }
        }


        return result;
    }

    public static int factorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            System.out.printf("---->%d\n", n);
            return n * factorielle(n - 1);
        }

    }

    public static void tabFactorielle(int[] tab) {
        int[] result = new int[tab.length];
        //int[] result = {2, 4, 99, 88, 7, 13, 12, 10, 18, 22};
        int index = 0;
        for (int i = 0; i < tab.length; i++) {

            result[index] = factorielle(tab[i]);
        }
        //RQ il faut constuire le tableau result avec
        for (int i = 0; i < result.length; i++) {

            System.out.printf("| %d", result[i]);

        }


        // Nombresremiers.java.getPrimeNumbers();

    }
}//class
