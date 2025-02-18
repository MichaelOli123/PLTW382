/*
 * Activity 3.8.1
 */
public class TileTester {
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" };

    public static void main(String[] args) {

        System.out.println("Tile Tester");

        Tile[][] gameboard = new Tile[3][4];

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[i].length; j++) {
                gameboard[i][j] = new Tile(tileValues[i*gameboard[i].length + j]);
            }
        }

        for (int i = 0; i < gameboard.length; i++) {
            System.out.println(java.util.Arrays.toString(gameboard[i]));
        }

    }
}
