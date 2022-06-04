import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }
    public static void printNQueens(int[][] chess, String ans, int row){
        if(row == chess.length){
            System.out.println(ans);
            return;
        }

        for(int col=0;col<chess[0].length;col++){
            if(isPalcesafe(chess, row, col)){
                chess[row][col] = 1;
                printNQueens(chess, ans + row + "-" + col + ", ",row+1 );
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isPalcesafe(int [][] chess, int row , int col){
        for(int r = row-1, c= col; r>=0;r--){
            if(chess[r][c]==1){
                return false;
            }
        }
        for(int r = row-1, c= col-1; r>=0 && c>=0;r--,c--){
            if(chess[r][c]==1){
                return false;
            }
        }
        for(int r = row-1, c= col-1; r>=0 && c>=0;r--,c--){
            if(chess[r][c]==1){
                return false;
            }
        }
        for(int r = row-1, c= col+1; r>=0 && c<chess[0].length;r--,c++){
            if(chess[r][c]==1){
                return false;
            }
        }
        return true;
    }
}
