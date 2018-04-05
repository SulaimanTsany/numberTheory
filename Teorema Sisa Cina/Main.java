import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TeoremaSisaCina test = new TeoremaSisaCina(3);

        System.out.print("Banyaknya Persamaan = ");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] m = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("a"+i+" = ");
            a[i] = input.nextInt();
            System.out.print("m"+i+" = ");
            m[i] = input.nextInt();
        }
        System.out.print();
        test.set(a, m);
        System.out.print("Solusi = "+test.getSolusi());
    }
}
