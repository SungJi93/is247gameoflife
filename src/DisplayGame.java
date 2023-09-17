
public class DisplayGame {


    public DisplayGame() {
    }

    public static void welcomeDisplay() {
        System.out.println("=======================================================================================");
        System.out.println("                                 Welcome to the Game of Life");
        System.out.println("Rules of the Game of Life\n" +
                "1. A dead cell becomes alive if a dead cell has EXACTLY three live neighbors.\n" +
                "2. A cell stays alive if it has either two or three neighbors.\n" +
                "3. A cell dies if it has more than 3 neighbors or has less than 2.");
        System.out.println("========================================================================================");
    }
    public static void displayGrid(GridLayout grid) {//this goes into the view class
        for (int r = 0; r < Grid.rows; r++) {
            for (int c = 0; c < Grid.columns; c++) {
                if (grid.getGridLayout(r, c) == 0) {
                    System.out.print(Grid.deadCell);
                } else if (grid.getGridLayout(r, c) == 1) {
                    System.out.print(Grid.aliveCell);
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
