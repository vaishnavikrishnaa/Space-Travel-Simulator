// Import necessary Java packages

public class main {
 
    public void spaceTravelSimulator() {
        // Declare and initialize a 2D array representing sectors in space
        String[][] spaceGrid = {
            {"Empty", "Asteroids", "Planet"},
            {"Alien Ship", "Empty", "Space Station"},
            {"Comet", "Black Hole", "Empty"}
        };
 
        // Display the initial state of the space grid
        System.out.println("Space Grid:");
        for (int i = 0; i < spaceGrid.length; i++) {
            for (int j = 0; j < spaceGrid[i].length; j++) {
                System.out.print(spaceGrid[i][j]+" ");
            }
            System.out.println();
        }
        // Simulate traveling through space by visiting random sectors
        System.out.println("\nStarting space travel...");
        Random random = new Random();
 
        for (int i = 0; i < 5; i++) {
            int row = random.nextInt(spaceGrid.length); // Get random row index
            int col = random.nextInt(spaceGrid[0].length); // Get random column index
            System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
        }
 
        // Calculate the number of "Empty" sectors
        int emptyCount = countEmptySectors(spaceGrid);
        System.out.println("\nTotal empty sectors: " + emptyCount);
 
        // Find the largest "event" (based on ASCII comparison) in the space grid
        String largestEvent = findLargestEvent(spaceGrid);
        System.out.println("Largest event in space grid: " + largestEvent);
    }

    // Method to count the number of "Empty" sectors in the space grid
    public int countEmptySectors(String[][] grid) {
        int count = 0;
        for (String[] row : grid) {
            for (String num : row) {
                if (num.equals("Empty")) {
                    count++;
                }
            }
        }
        return count;
    }
 
    // Method to find the largest event in the space grid (lexicographically)
    public String findLargestEvent(String[][] grid) {
        String largest = grid[0][0];
        for (String[] row : grid) {
            for (String sector : row) {
                if (sector.compareTo(largest) > 0) {
                    largest = sector;
                }
            }
        }
        return largest;
    }
}
