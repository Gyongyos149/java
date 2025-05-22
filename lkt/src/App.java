public class App {

    public static void main(String[] args) throws Exception {
        int result = lkt(12, 20);
        System.out.println("lkt:"+result);
    }

    static int lkt(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        int lkt = max;
        //while(lkt % min != 0){
        //  lkt = lkt + max;
        //}
        for(;lkt % min != 0; lkt = lkt + max){

        }
        return lkt;
    }

     /*  írj egy fügvényt ami két szám legkisebb közös többszörösét visszaadja. */
    
    static int lkt(int a, int b) {
      int max =  Math.max(a, b);
      int min = Math.min(a, b);
      int lkt = max;

      while (lkt % min !=0) {
        lkt = lkt+max;
      }

      return lkt;
    }
  
    static int lkt2(int a, int b) {
      int max =  Math.max(a, b);
      int min = Math.min(a, b);
      int lkt = max;
      // (<init/érétkadás>; <condition>; increment/decrement) 
      for (; lkt % min !=0; lkt = lkt+max) {

      }
      return lkt;
    }

    /*
     * Irja ki a mértani sor első n elemét:
     * a1 a mértani sor első eleme
     * q a szorzat
     * n: elemek száma
     */
    static void mertaniSor(double a1, double q, int n) {
      
      System.out.print(a1);
      double an = a1;
      for(int i=1; i<n; i++){
          an = an * q;
          System.out.print(" " + an);
      }
      System.out.println("");
    }
}
