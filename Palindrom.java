// Palindrom Check

public class Palindrom {
  public static void main (String[] args) {
    String original = "racecar";
    String reversed = "";

    /* Insert code solution here */
    for (int i = original.length() - 1; i >= 0; i--){
      reversed = reversed + original.charAt(i);
    } 

    if (original.equals(reversed)){
      System.out.print("The word, " + original + ", is a palindrom.");
    }
    else {
      System.out.print(" The word, " + reversed + ", is not a palindrom.");
    }
  }
}