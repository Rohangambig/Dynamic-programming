

public class Tabulation {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,5,1}
        };

        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0 ; i < m ;i++) {

            for(int j = 0 ; j < n; j++) {
                if(i == 0 && j == 0) dp[i][j] = arr[i][j];
                else {
                    int top  = Integer.MAX_VALUE / 2;
                    int left  = Integer.MAX_VALUE / 2;
                    if( i > 0) top = dp[i-1][j];
                    if(j > 0) left = dp[i][j-1];

                    dp[i][j] = arr[i][j] +  Math.min(top,left); 
                }

            }
        }

        System.out.println(dp[m-1][n-1]);

    }
}