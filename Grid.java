public class Grid {
    public static int rows = 1000;
    public static int columns = 1000;
    public static int generations;
    public static int sleep;
    public static char deadCell = '▯';
    public static char aliveCell= '▮';

    public static void rulesGeneration(GridLayout grid, GridLayout nextGrid) {
        int alive = 1;
        int dead = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid.getGridLayout(i, j) == alive && neighborCheck(i, j, grid) < 2) {
                    nextGrid.populateCell(i, j, dead);
                } else if (grid.getGridLayout(i, j) == alive && neighborCheck(i, j, grid) < 4) {
                    nextGrid.populateCell(i, j, alive);
                } else if (grid.getGridLayout(i, j) == alive && neighborCheck(i, j, grid) > 3) {
                    nextGrid.populateCell(i, j, dead);
                } else if (grid.getGridLayout(i, j) == dead && neighborCheck(i, j, grid) == 3) {
                    nextGrid.populateCell(i, j, alive);
                } else {
                    nextGrid.populateCell(i, j, dead);
                }
            }
        }
    }

    public static int neighborCheck(int row, int col, GridLayout grid) {
        int check = 0;
        int condition = 1;
        for (int i = row - condition; i <= row + condition; i++) {
            for (int j = col - condition; j <= col + condition; j++) {
                if (!(i < 0 || i >= rows || j < 0 || j >= columns
                        || i == row && j == col || grid.getGridLayout(i, j) != 1)) {
                    check++;
                }
            }
        }
        return check;
    }

    public static void updateNextGeneration(GridLayout grid, GridLayout nextGrid) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                grid.populateCell(r, c, nextGrid.getGridLayout(r, c));
            }
        }
    }

    public static void sleepTimer(int timeDelay) {
        try {
            Thread.sleep(timeDelay);
        } catch (Exception e) {
            System.out.println("Exception:" + e.getStackTrace());
        }
    }


    public static void Glider(GridLayout initial) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                initial.populateCell(0, 1, 1);
                initial.populateCell(1, 2, 1);
                initial.populateCell(2, 0, 1);
                initial.populateCell(2, 1, 1);
                initial.populateCell(2, 2, 1);
            }
        }
    }

    public static void Spaceship(GridLayout initial) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                initial.populateCell(2, 2, 1);
                initial.populateCell(4, 2, 1);
                initial.populateCell(5, 3, 1);
                initial.populateCell(5, 4, 1);
                initial.populateCell(5, 5, 1);
                initial.populateCell(4, 6, 1);
                initial.populateCell(3, 6, 1);
                initial.populateCell(2, 5, 1);
            }
        }
    }

    public static void Exploder(GridLayout initial) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                initial.populateCell(4, 4, 1);
                initial.populateCell(5, 3, 1);
                initial.populateCell(6, 3, 1);
                initial.populateCell(6, 4, 1);
                initial.populateCell(7, 4, 1);
                initial.populateCell(6, 5, 1);
                initial.populateCell(5, 5, 1);
            }
        }
    }

    public static void Beacon(GridLayout initial) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                initial.populateCell(0, 1, 1);
                initial.populateCell(1, 1, 1);
                initial.populateCell(0, 2, 1);
                initial.populateCell(2, 4, 1);
                initial.populateCell(3, 4, 1);
                initial.populateCell(3, 3, 1);
            }
        }
    }
}
