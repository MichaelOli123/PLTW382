/*
 * Activity 3.8.2
 */
public class Traversing2DArrays
{
  public static void main(String[] args)
  {
   String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    /* your code here */
    for (int i=0; i<board.length; i++) {
      for (int j=0; j<board[0].length; j++){
        System.out.println(board[i][j]);
      }
    }
}
}
