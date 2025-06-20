import java.util.Arrays;
public class Tabulation {
    public static void main(String[] args) {
        int[][] arr = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };

        int size = arr.length;

        int[][] dp = new int[size][size];

        for(int i = 0 ; i < size; i ++) 
            Arrays.fill(dp[i],-1);

        
        for(int i = 0 ; i < size; i++) {
            dp[size-1][i] = arr[size-1][i];
        }

        for(int i = size-2; i >= 0; i--) {

            for(int j = 0 ; j <=  i ; j++) {
                dp[i][j] = arr[i][j] + Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }

        System.out.println(dp[0][0]);
    }
}