
public class SpaceOptimization {
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };


        int m = arr.length;
        int n = arr[0].length;

        int[] dp = new int[n];

        for(int i = 0 ; i < m ; i ++) {

            int[] temp =  new int[n];

            for(int j = 0; j < n;j++) {
                if(arr[i][j] == 1) continue;
                if(i == 0 &&j == 0) temp[0] = 1;
                else {
                    temp[j] = dp[j];
                    if(j > 0) temp[j] += temp[j-1];
                }
            }

            dp = temp;
        }

        System.out.println(dp[n-1]);

    }
}