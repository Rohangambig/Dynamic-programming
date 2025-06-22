
class Tabulation {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}
        };

        int row = arr.length;
        int column = arr[0].length;

        int[][][] dp = new int[row][column][column];

        for (int j1 = 0; j1 < column; j1++) {
            for (int j2 = 0; j2 < column; j2++) {
                if (j1 == j2) {
                    dp[row - 1][j1][j2] = arr[row - 1][j1]; 
                }else {
                    dp[row - 1][j1][j2] = arr[row - 1][j1] + arr[row - 1][j2];
                }
            }
        }

        for (int i = row - 2; i >= 0; i--) {
            
            for (int j1 = 0; j1 < column; j1++) {
                for (int j2 = 0; j2 < column; j2++) {

                    int maximum = Integer.MIN_VALUE;
                    for (int dj1 = -1; dj1 <= 1; dj1++) {

                        for (int dj2 = -1; dj2 <= 1; dj2++) {

                            int value;
                            if (j1 == j2) {
                                value = arr[i][j1]; 
                            }else {
                                value = arr[i][j1] + arr[i][j2];
                            }

                            if(dj1 + j1 >= 0 &&  dj1 + j1 < column && dj2 + j2 >= 0 && dj2 + j2 < column)
                                value += dp[i + 1][dj1 + j1][dj2 + j2];

                            else 
                                value = Integer.MIN_VALUE;
                            
                            maximum = Math.max(maximum, value);
                        }

                    }

                    dp[i][j1][j2] = maximum;

                }
            }
        }

        System.out.println(dp[0][0][column-1]);

    }
}
