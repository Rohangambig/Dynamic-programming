public class SpaceOptimization {
    public static void main(String[] args) {
        int[][] arr = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };

        int size = arr.length;

        int[] dp = new int[size];
        
        for(int i = 0 ; i < size; i++) {
            dp[i] = arr[size-1][i];
        }

        for(int i = size-2; i >= 0; i--) {

            for(int j = 0 ; j <=  i ; j++) {
                dp[j] = arr[i][j] + Math.min(dp[j], dp[j+1]);
            }
        }

        System.out.println(dp[0]);
    }
}