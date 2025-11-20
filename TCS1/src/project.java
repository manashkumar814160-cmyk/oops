import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Define grid size
        int rows = 5;
        int cols = 5;
        char[][] island = new char[rows][cols];

        // Initialize island with '~' (water)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                island[i][j] = '~';
            }
        }

        // Random treasure position
        int treasureRow = rand.nextInt(rows);
        int treasureCol = rand.nextInt(cols);

        int attempts = 0;
        boolean found = false;

        System.out.println("🏝 Welcome to the Treasure Hunt Game!");
        System.out.println("The island is a " + rows + "x" + cols + " grid.");
        System.out.println("Find the hidden treasure!");
        System.out.println("Enter your guesses as: row column (0-based index).");

        // Game loop runs until treasure found
        while (!found) {
            System.out.print("\nEnter row (0 - " + (rows - 1) + "): ");
            int guessRow = sc.nextInt();
            System.out.print("Enter column (0 - " + (cols - 1) + "): ");
            int guessCol = sc.nextInt();
            attempts++;

            if (guessRow == treasureRow && guessCol == treasureCol) {
                System.out.println("\n🎉 Congratulations! You found the treasure in " + attempts + " attempts!");
                island[guessRow][guessCol] = 'X';
                found = true;
            } else {
                System.out.println("❌ No treasure here!");
                island[guessRow][guessCol] = 'O';

                // Provide directional hints
                if (guessRow > treasureRow) {
                    System.out.println("💡 Hint: The treasure is above your guess.");
                } else if (guessRow < treasureRow) {
                    System.out.println("💡 Hint: The treasure is below your guess.");
                }

                if (guessCol > treasureCol) {
                    System.out.println("💡 Hint: The treasure is to the left of your guess.");
                } else if (guessCol < treasureCol) {
                    System.out.println("💡 Hint: The treasure is to the right of your guess.");
                }
            }

            // Display the current map
            printIsland(island);
        }

        sc.close();
    }

    // Helper function to print island map
    public static void printIsland(char[][] island) {
        System.out.println("\nCurrent Map:");
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                System.out.print(island[i][j] + " ");
            }
            System.out.println();
        }
    }
}
