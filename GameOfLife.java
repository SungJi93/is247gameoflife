import java.util.Scanner;

public class GameOfLife {

    public static void main(String[] args) {
        GameOfLife obj = new GameOfLife();
        obj.beginGame();
    }

    public GameOfLife() {

    }

    public void beginGame() {
        Scanner input = new Scanner(System.in);
        GridLayout gridOne = new GridLayout(Grid.rows, Grid.columns);
        GridLayout gridTwo = new GridLayout(Grid.rows, Grid.columns);
        DisplayGame.welcomeDisplay();
        inputGrid(input);
        chooseSleep(input);
        howManyGen(input);
        patternChoice(input, gridOne);
        for (int i = 1; i <= Grid.generations; i++) {
            System.out.println("Generation " + i);
            DisplayGame.displayGrid(gridOne);
            Grid.sleepTimer(Grid.sleep);
            Grid.rulesGeneration(gridOne, gridTwo);
            Grid.updateNextGeneration(gridOne, gridTwo);

            if (i == Grid.generations) {
                System.out.println("Total Number of Generations: " + Grid.generations);
            }
        }
    }

    public void inputGrid(Scanner sc) {
        System.out.print("How many rows?: ");
        Grid.rows = sc.nextInt();
        System.out.print("How many columns?: ");
        Grid.columns = sc.nextInt();
    }


    public void chooseSleep(Scanner sc) {
        System.out.print("Sleep time in between generations: ");
        Grid.sleep = sc.nextInt();
    }

    public void howManyGen(Scanner sc) {
        System.out.print("How many generations: ");
        Grid.generations = sc.nextInt();
    }

    public void patternChoice(Scanner sc, GridLayout grid) {
        int choice;
        System.out.println("What pattern would you like to display? \n" +
                "1: Glider \n" +
                "2: Spaceship \n" +
                "3. Exploder\n" +
                "4. Beacon");
        choice = sc.nextInt();
        switch (choice) {

            case 1: {
                Grid.Glider(grid);
                break;
            }
            case 2: {
                Grid.Spaceship(grid);
                break;
            }
            case 3: {
                Grid.Exploder(grid);
                break;
            }
            case 4: {
                Grid.Beacon(grid);
                break;
            }

        }
    }
}

