// Program to find the sum of natural numbers from 1 to 1000.

class Factorial{

  public static void main(String[] args) {
      
    int fac = 100000;
    double n =  100000;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      fac = fac* i;     // fac = fac + i
    }
    double  resultado = fac/n;
    System.out.println (fac);
    System.out.println("fac = " + resultado);
  }
} 