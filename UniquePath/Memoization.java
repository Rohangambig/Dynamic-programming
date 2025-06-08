
import java.util.Arrays;

class Memoization {

    public static int findUniquePath(int m,int n,int[][] dp) {
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];

        int top =  findUniquePath(m-1, n,dp);
        int left = findUniquePath(m,n-1,dp);

        return dp[m][n]  = left + top;
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        int[][] dp = new int[m][n];

        for(int i = 0 ; i < m ;i++) {
            Arrays.fill(dp[i],-1);
        }

        System.out.println(findUniquePath(m-1,n-1,dp));
    }
}