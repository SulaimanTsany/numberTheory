import java.util.Scanner;
import java.util.ArrayList;

public class FaktorisasiPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        faktorPrima(x);
    }
    public static void faktorPrima (int x) {
        String result = "";
        int[] listPrim = primList(x);
        int[] pow = new int[listPrim.length];
        int index = 0;
        while (x > 1) {
            int count = 0;
            while (x%listPrim[index]==0) {
                x = x/listPrim[index];
                count++;
            }
            pow[index] = count;
            if (pow[index] != 0) {
                System.out.print(listPrim[index]+"^"+pow[index]+" ");
            }
            index++;
        }
    }
    public static int[] primList (int x) {
        ArrayList<Integer> prima = new ArrayList<Integer>();
        for (int i=2; i<=x; i++) {
            if (cekPrim(i)) {
                prima.add(i);
            }
        }
        int[] result = new int[prima.size()];
        for (int i=0; i<prima.size(); i++) {
            result[i] = prima.get(i);
        }
        return result;
    }
    public static boolean cekPrim (int x) {
        if (x<2 || (x>2 && x%2==0)) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(x); i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }
}
