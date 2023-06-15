// Finding the Maximum Value in an Array

public class FindArray {
  public static void main(String[] args) {
  int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
  int max = numbers[0];
  
  /* Process here the max value will be save to max variable use loop */

  for(int i= 0; i < numbers.length; i++) {
    
    if (numbers[i] > max) {
      max = numbers[i];
    }
  }

  System.out.println("The maximum value in the array is: " + max);
  }
}