public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] grid1 = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        char[][] grid2 = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        char[][] grid3 =
                {{'0', '0', '1', '1', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}};
        char[][] grid4 =
                {{'0', '0'}, {'1', '1'}};

   System.out.println(numIslands(grid4));

    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    getNumOfIslands(grid, i, j);
                }
            }
        }
        return islands;
    }

    public static void getNumOfIslands(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        Queue<int[]> coordinates = new LinkedList<>();
        coordinates.add(new int[]{i, j});

        while (!coordinates.isEmpty()) {
            int[] currentLocation = coordinates.poll();
                for (int[] d : dir) {
                    int row = currentLocation[0] + d[0];
                    int col = currentLocation[1] + d[1];
                    if (row >= 0 && col >= 0 && row < m && col < n && (grid[row][col] == '1')) {
                        coordinates.add(new int[]{row, col});
                        grid[row][col] = '0';
                    }

                }
            }
        }
    }
