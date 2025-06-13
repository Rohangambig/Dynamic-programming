import java.util.Arrays;

public class Tabulatoin {
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


        for(int i = 0 ; i < m ; i ++) {

            for(int j = 0; j < n;j++) {
                if(arr[i][j] == 1) continue;
                if(i == 0 &&j == 0) dp[0][0] = 1;
                else {
                    int right = 0;
                    if(i > 0) right = dp[i-1][j];

                    int bottom = 0;
                    if(j > 0) bottom = dp[i][j-1];

                    dp[i][j] = right +  bottom;
                }
            }
        }

        System.out.println(dp[m-1][n-1]);

    }
}