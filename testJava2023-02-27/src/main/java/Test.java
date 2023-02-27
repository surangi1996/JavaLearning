import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
    /**
     * Reads a 3x3 grid from the specified file.
     */
    private static int[][] readGridFromFile(String filename) {
        int[][] grid = new int[3][3];
            try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                for (int i = 0 ; i < 3 ; i++){
                    String[] lines = reader.readLine().split(" ");
                    for (int j = 0; j < 3; j++){
                        grid[i][j] = Integer.parseInt(lines[j]);
                    }
                }

            }catch(Exception e){
                System.err.println("Error reading file: " + e.getMessage());
            }
        return grid;
    }

    /**
     * Checks if the rows and columns of the specified grid all sum to 15.
     */
    private static boolean isGridValid(int[][] grid) {

        for (int i = 0 ; i < 3 ; i++){
            int rowSum =0;
            int colSum = 0;
            for (int j = 0 ; j< 3 ; j++){
                rowSum += grid[i][j];
                colSum += grid[i][j];
            }
            if (rowSum != 15 || colSum != 15) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[][] grid = readGridFromFile("grid.txt");
        boolean isGridValid = isGridValid(grid);
        System.out.println("The grid is " + (isGridValid ? "valid" : "invalid"));
    }
}
