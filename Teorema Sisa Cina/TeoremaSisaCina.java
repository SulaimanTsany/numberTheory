public class TeoremaSisaCina {
    private int[] a;
    private int[] x;
    private int[] m;
    private int[] N;
    private int n;
    private int X;

    public TeoremaSisaCina(int size) {
        a = new int[size];
        m = new int[size];
        N = new int[size];
        x = new int[size];
    }
    public int getSolusi () {
        return X;
    }
    public void set (int[] a, int [] m) {
        this.a = a;
        this.m = m;
        set_n();
        set_N();
        set_x();
        set_solusi();
    }
    public int getn () {
        return n;
    }
    private void set_solusi () {
        int total =0;
        for (int i=0; i<x.length; i++) {
            total += (x[i]*N[i]*a[i]);
        }
        for (int i=0; i<m.length; i++) {
            System.out.println("x="+a[i]+" (mod "+m[i]+")");
        }
        System.out.println("\nTotal = "+total);
        System.out.println("n = "+n);
        this.X = total%n;
    }
    private void set_n () {
        this.n = 1;
        for (int i:m) {
            n *=i;
        }
    }
    private void set_N () {
        for (int i=0; i<N.length; i++) {
            N[i] = n/m[i];
        }
    }
    private void set_x () {
        for (int i=0; i<x.length; i++) {
            x[i] = solusi_x(N[i], m[i]);
            System.out.println(N[i]+"x := 1 ( mod "+m[i]+")"+ "--> x="+x[i]);
            System.out.println("a"+i+" = "+a[i]);
            System.out.println("m"+i+" = "+m[i]);
            System.out.println("N"+i+" = "+N[i]);
            System.out.println();
        }
    }
    private int solusi_x (int a, int m) {
        //return 0 jika tidak ada solusi;
        int ax;
        for (int i=1; i<=m; i++) {
            ax = a*i-1;
            if (ax%m==0) {
                return i;
            }
        }
        return 0;
    }
    private int fpb (int a, int b) {
        int fpb=1;
        if (b<a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i=2; i<=a; i++) {
            if (a%i==0 && b%i==0) {
                fpb=i;
            }
        }
        return fpb;
    }
}
