public class spaceOptimization {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,5,1}
        };

        int m = arr.length;
        int n = arr[0].length;

        int[] dp = new int[n];

        for(int i = 0 ; i < m ;i++) {
            int[] temp = new int[n];

            for(int j = 0 ; j < n; j++) {
                if(i == 0 && j == 0) temp[j] = arr[i][j];
                else {
                    int top  = Integer.MAX_VALUE / 2;
                    int left  = Integer.MAX_VALUE / 2;
                    if( i > 0) top = dp[j];
                    if(j > 0) left = temp[j-1];

                    temp[j] = arr[i][j] +  Math.min(top,left); 
                }

            }

            dp = temp;
        }

        System.out.println(dp[n-1]);

    }
}