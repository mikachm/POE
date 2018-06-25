package com.formation;

public class Main {

    public static void main(String [] args) {
/////////////////////////////////////////////////////////////
        int[] tab = {2, -2, 99, 88, 7, 13, 12, 10, 18, 22};//correction
        System.out.println(isPrime(7));

    }
        public static boolean isPrime(int n){
            boolean result = true;
            if(n<2){
                result = false;
            }else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        result = false;
                        break;
                    }
                }
            }
                return result;
        }// isPrime



        public static int getPrimeNumbers(int[] tab){
            int[] result = new int[tab.length];
            int index = 0;
            for(int i : tab){
                if(isPrime(i)){
                    result[index] = i;
                    index++;
                 }
            }
            return result;
        }



       // Nombresremiers.java.getPrimeNumbers();

}
