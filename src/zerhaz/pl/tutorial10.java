package zerhaz.pl;

public class tutorial10 {
    public static void print() {
        int[][] grid = {
                {1, 2, 3},
                {10, 20, 30, 40},
                {100, 200}
        };

        System.out.println(grid[1][3]);

        String[][] texts = new String[2][3];

        for (int row = 0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++){
                System.out.println(grid[row][col]);
            }
        }
    }
}
