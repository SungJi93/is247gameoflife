public class GridLayout {
     int[][] grid;

    public GridLayout () {

    }

    public GridLayout(int rows, int columns) {

        this.grid= new int[rows][columns];
    }
    public void populateCell(int row, int column, int cellState) {
        this.grid[row][column] = cellState;
    }

    public int getGridLayout(int rows, int columns) {
        return this.grid[rows][columns];
    }

    public void setGridLayout(int[][] grid) {
        this.grid = grid;
    }
}
