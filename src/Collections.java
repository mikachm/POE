import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8));//collection
        System.out.printf("la somme est de : %d\n", sum(l));
        System.out.printf("le minimum est : %d\n", min(l));
        System.out.printf("le maximum est : %d\n", max(l));
        System.out.printf("la moyenne est : %2f\n", moyenne(l));
        //System.out.printf("la moyenne est : %2f\n", moyenne(l));
        System.out.printf("les nombres premiers sont :" );
        for (int i = 0; i <l.size() ; i++) {
             System.out.print(getPrimeNumbers(l).get(i));
            System.out.printf(" ");
        }
        System.out.printf("la liste inversé est :\n" );
        for (int i = 0; i <l.size() ; i++) {
            System.out.print(inverse2(l).get(i));
            System.out.printf(" ");
        }

    }

//TP
//Méthodes qui font : sum , min, max, average, getPrimeNumbers
//TP
//inverse => 1,2,3,4 renvoir 4,3,2,1
//TP
//Refaire inverse sans créer une nouvelle liste cad en détruisant la liste originale

    //sum
    public static int sum(ArrayList<Integer> l) {
        int somme = 0;
        for (int i = 0; i < l.size(); i++) {
            somme = somme + l.get(i);
        }//for
        return somme;
    }//sum


    //min
     public static int min(ArrayList<Integer> l) {
         int min = l.get(0);
         for (int i = 0; i < l.size(); i++) {
             if(l.get(i)<=min)
             {min = l.get(i);}
         }//for
         return min;
     }//min


    //max
    public static int max(ArrayList<Integer> l) {
        int max = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if(max<=l.get(i))
            { max = l.get(i);}
        }//for
        return max;
    }//max


    //moyenne
    public static double moyenne(ArrayList<Integer> l) {
        int somme = 0;
        double moy =0;
        for (int i = 0; i < l.size(); i++) {
            somme =somme + l.get(i);
        }//for
        moy=(double)somme/l.size(); //piege java int/int renvoi int, il faut le caster
        return moy;
    }//moyenne


///////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////primeNumbers///////////////////////

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


    public static ArrayList<Integer> getPrimeNumbers(ArrayList <Integer> l) {
        //int[] result = new int[tab.length];
        ArrayList <Integer> result = new ArrayList<Integer>();
        //int index = 0;
       // for (int i : l) {
           // if (isPrime(i)) {
            //    result.add(i,index);
             //   index++;
            //}
        for (int i = 0; i < l.size(); i++) {
            if (isPrime(l.get(i))) {
                    result.add(l.get(i));
                }
        }
        return result;
    }
////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Integer> inverse(ArrayList<Integer> l){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = l.size(); i >=0 ; i--) {
            int value = l.get(i);
            res.add(value);  //res.add(l.get(i));
        }
        return res;
    }//inverse

    public static ArrayList<Integer> permut(ArrayList<Integer> l, int index1, int index2){
        int temp = l.get(index1);
        l.set(index1, l.get(index2));
        l.set(index2, temp);
        return l;
    }//permut

    //inverse2
    public static ArrayList<Integer> inverse2(ArrayList<Integer> l){
        for (int i = 0; i <((l.size()+1)/2) ; i++) {
            l = permut(l,i, l.size() -1 - i);
        }
        return l;
    }
    //alternative en récursif, ou en ajoutant le 1er élt à la fin de la liste et en enlevant le 1er

}//collections