


public class SpaceOptimization {
    public static void main(String[] args) {
        int[][] arr = {
            {18, 11, 19},
            {4, 13, 7},
            {1, 8, 13}
        };

        int size = arr.length;
        int[] dp = new int[3];

        System.arraycopy(arr[0],0,dp,0,3);

        for(int i = 1;i< size; i ++) {
            
            int[] dummy_arr = new int[3];
            for(int j = 0; j < 3; j++)  {
                int maximum = 0;

                for(int k = 0 ; k < 3; k ++) {
                    if( j != k) 
                        maximum = Math.max(maximum,arr[i][j] +  dp[k]);
                }

                dummy_arr[j] = maximum;
            }
            dp = dummy_arr;

        }

        int ans = 0;
        for(int i = 0; i< 3 ;i ++) {
            ans = Math.max(ans,dp[i]);
        }

        System.out.println(ans);
        
    }
}