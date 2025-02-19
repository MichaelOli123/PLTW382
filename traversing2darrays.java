/*
 * Activity 3.8.2
 */
public class Traversing2DArrays {
  public static void main(String[] args) {
    String[][] board = {{"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}}; 
                       
    /* your code here */
    for (String[] row : board) {
      for (String str : row) {
      System.out.print(str + "\t");
      }
      System.out.println("");
    }
  }
}
