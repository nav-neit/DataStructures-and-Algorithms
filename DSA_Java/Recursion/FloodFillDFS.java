import java.util.Scanner;

public class FloodFillDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean [][] visited  = new boolean[n][m];
        floodfill(arr, 0, 0,"", visited);
    }
    public static void floodfill(int [][] maze, int row, int col, String ans, boolean [][] visited){
        // if we go out of maze or in the maze and reached the obstacle
        if(col<0 || row<0 || row == maze.length || col==maze[0].length ||
                maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        visited[row][col] = true;
        floodfill(maze, row-1, col, ans + "t", visited);
        floodfill(maze, row, col -1, ans + "l", visited);
        floodfill(maze, row+1, col, ans + "d", visited);
        floodfill(maze, row, col+1, ans + "r", visited);
        visited[row][col] = false;
    }
}
