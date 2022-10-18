// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    double n =  2;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
    double  resultado = sum/n;
    System.out.println (sum);
    System.out.println("Sum = " + resultado);
  }
} 