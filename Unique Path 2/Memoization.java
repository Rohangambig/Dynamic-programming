import java.util.Arrays;

public class Memoization {

    public static int findUniquePath(int m,int n,int[][] arr,int[][] dp) {
        if(m < 0  || n < 0 || arr[m][n] == 1) return 0;

        if(m == 0 && n == 0) return 1;

        int top = findUniquePath(m-1, n, arr,dp);
        int left = findUniquePath(m, n-1, arr,dp);

        return dp[m][n] = top + left;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };


        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];
        
        for(int i = 0 ; i < m ;i++) {
            Arrays.fill(dp[0],-1);
        }

        System.out.println("Number of possible unique path is : "+ findUniquePath(m-1,n-1,arr,dp));

    }
}