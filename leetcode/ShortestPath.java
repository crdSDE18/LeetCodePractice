package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {


    public static void main(String[] args) {

        int size = 1;
        int a = size--;
        System.out.println(a);
        int[][] grid = {{0,1},{1,0},{1,0}};
       System.out.println(shortestPath(grid));


    }

    public static int shortestPath(int[][] grid) {
       int[][] directions = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1}, {-1,1}, {-1,-1}};

        if (grid[0][0] == 1) return -1; //first square isn't accessible because it's 1
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.add( new int[]{0,0,1});
        grid[0][0] = 1;

        while(!queue.isEmpty()){
            int size = queue.size(); // gives first level of nearest nodes
            while(size -- >0){ //means at the same level
               int[] current_location = queue.poll(); // check all directions at this level

                if(current_location[0] == m -1 && current_location[1] == n-1){
                    return current_location[2];
                }
                for(int[] d: directions){
                    int row = current_location[0] + d[0];
                    int col = current_location[1] +d[1];

                    if(row >= 0 && col>= 0 && row <m && col<n && grid[row][col]== 0){
                        queue.add(new int[]{row,col,current_location[2]+1});
                        grid[row][col] =1;
                    }
                }
            }

        }

        return 1;

    }
}
