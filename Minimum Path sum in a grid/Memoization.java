
import java.util.Arrays;

public class Memoization {

    public static int minimumPath(int[][] arr,int m,int n,int[][] dp) {
        if(m == 0 && n == 0) return arr[0][0];
        if( m < 0 || n < 0) return Integer.MAX_VALUE / 2;
        if(dp[m][n] != -1) return dp[m][n];

        int top = arr[m][n] + minimumPath(arr, m-1, n,dp);
        int left = arr[m][n] + minimumPath(arr, m, n-1,dp);

        return dp[m][n] = Math.min(top,left);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,5,1}
        };

        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0 ; i < m;i ++) 
            Arrays.fill(dp[i],-1);

        System.out.println(minimumPath(arr,m-1,n-1,dp));
    }
}