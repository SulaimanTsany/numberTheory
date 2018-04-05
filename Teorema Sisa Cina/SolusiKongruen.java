public class SolusiKongruen {
    public static void main(String[] args) {
        int a = 35;
        int b = 1;
        int m = 81;
        System.out.println("x= " + solusiKongruen(a, b, m));
    }
    public static int solusiKongruen (int a, int b, int m) {
      int x;
      int ax;
      for (int i=1; i<=m; i++) {
          ax = a*i;
          if (ax%m == b) {
              x = i;
              return x;
          }
      }
      return 0;
    }
}
