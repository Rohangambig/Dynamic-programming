
import java.util.Arrays;


class Memoization {

    public static int CherryPickup(int[][] arr,int i,int j1,int j2, int r,int c,int[][][] dp) {
        if( j1 < 0 || j1 >= c || j2 < 0 || j2 >= c) return Integer.MIN_VALUE;
        if( dp[i][j1][j2] != -1) return dp[i][j1][j2];

        if(i == r-1) {
            if(j1 == j2) return arr[i][j1];
            else return arr[i][j1] + arr[i][j2];
        }

        int maximum = Integer.MIN_VALUE;
        for(int dj1 = -1; dj1 <= 1; dj1 ++) {

            for(int dj2 = -1; dj2 <= 1; dj2 ++) {

                int value;
                if (j1 == j2) value = arr[i][j1];
                else value =  arr[i][j1] + arr[i][j2];

                value += CherryPickup(arr, i + 1, dj1 + j1,dj2 + j2, r, c,dp);
                maximum = Math.max(maximum, value);
            }

        }

        return dp[i][j1][j2] = maximum;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {3,1,1},{2,5,1},{1,5,5},{2,1,1}
        };

        int row = arr.length;
        int column = arr[0].length;

        int[][][] dp = new int[row][column][column];

        for(int i = 0 ; i < row; i++) {
            for(int j = 0 ; j < column; j++) {
                Arrays.fill(dp[i][j],-1);
            }
        }

        System.out.println( CherryPickup(arr,0,0,column-1, row,column, dp) );
    }
} 