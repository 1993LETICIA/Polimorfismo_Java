
package estatico;

public class Soma {
    public int soma(int x, int y){
        System.out.print("soma(int x, int y)");
                return x + y;
    }
     public double soma(double x, double y){
        System.out.print("soma(double x, double y)");
                return x + y;
    }
       public double soma(int x, double y){
        System.out.print("soma(int x, double y)");
                return x + y;
                
       }
       public double soma(double x, int y){
        System.out.print("soma(double x, int y)");
                return x + y;
       }
      public String soma(String x, String y){
        System.out.print("soma(String x, String y)");
                return x + y;
    }
       
    
}

