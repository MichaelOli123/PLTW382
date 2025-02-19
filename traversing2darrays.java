/*
 * Activity 3.8.2
 */
public class Traversing2DArrays {
  public static void main(String[] args) {
   String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    /* indexed for loop */
    for (int i=0; i<board.length; i++) {
      for (int j=0; j<board[0].length; j++){
        System.out.print(board[i][j] + "\t");
      }
      System.out.println("");
    }
    
    System.out.println("");

    /* enhanced for loop */
    for (String[] row : board) {
      for (String str : row) {
      System.out.print(str + "\t");
      }
      System.out.println("");
    }
}
}
