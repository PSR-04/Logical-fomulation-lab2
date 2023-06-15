// Fibonacci Series

public class Main {
  public static void main(String[] args) {
    int n = 10;
    int t1 = 0, t2 = 1;
    System.out.print("First " + n + " terms: ");
    
    /* insert your code here */

    int i = 0;
    while (i < n) {
      // Print the number
      System.out.print(t1 + " ");

      // Swap
      int t3 = t2 + t1;
      t1 = t2;
      t2 = t3;
      i = i + 1;
    }
  }
}