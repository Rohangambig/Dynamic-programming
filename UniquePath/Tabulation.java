
class Tabulation {
    public static void main(String[] args) {
        int m = 3, n = 7;

        int[][] dp = new int[m][n];

        for(int i = 0 ; i < m; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(i == 0 && j == 0) dp[0][0] = 1;

                else {
                    int top = 0;
                    if( i > 0) top = dp[i-1][j];

                    int left = 0;
                    if(j > 0) left = dp[i][j-1];

                    dp[i][j] = top + left;
                }
            
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}