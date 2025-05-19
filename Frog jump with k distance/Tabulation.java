import java.util.Arrays;
public class Tabulation {
       public static void main(String[] args) {
        int arr[] = {10, 5, 20, 0, 15};
        int size = arr.length;
        int k = 2;
        int[] dp = new int[size];
        dp[0] = 0;

        for(int i = 1; i < size; i++ ) {
            int minimumJump = Integer.MAX_VALUE;

            for(int j = 1; j <= k ;j ++) {
                if(i - j >= 0) 
                    minimumJump = Math.min(minimumJump,dp[i-j] + Math.abs(arr[i] -arr[i-j]));
                else break;
            }

            dp[i] = minimumJump;
        }
        System.out.println(Arrays.toString(dp));
    }
}