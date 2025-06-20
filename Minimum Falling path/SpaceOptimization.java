class SpaceOptimization {

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        int size = arr.length;

        int[] dp = new int[size];

        for (int i = 0; i < size; i++) {
            dp[i] = arr[size - 1][i];
        }

        for (int i = size - 2; i >= 0; i--) {
           
            int temp[] = new int[size];

            for (int j = 0; j < size; j++) {
                int result = Integer.MAX_VALUE;

                for (int k = 0; k < size; k++) {
                    if (j != k) {
                        result = Math.min(result, arr[i][j] + dp[k]);
                    }
                }

                 temp[j] = result;
            }

            dp = temp;

        }
        int minimum =  Integer.MAX_VALUE;

        for(int i =  0; i< size ; i++)
            minimum = Math.min(minimum, dp[i]);
        System.out.println(minimum);
    }
}