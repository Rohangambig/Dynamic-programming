import java.lang.reflect.Array;
import java.util.Arrays;

class Memoizaition {

    public static int  knapsack(int[] val,int[] wt,int index, int capacity,int[][] dp) {
        if(capacity <= 0) return 0;
        if(index == 0) {
            if(capacity >= wt[0]) return val[0];
            return 0;
        }

        if(dp[index][capacity] != -1) return   dp[index][capacity];

        int take = 0;
        if(capacity >= wt[index])
            take = val[index] + knapsack(val, wt, index-1, capacity - wt[index],dp);

        int nonTake = knapsack(val, wt, index-1, capacity,dp);

        return dp[index][capacity] = Math.max(take,nonTake);
    }
    public static void main(String[] args){
        int capacity = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4,5,1};

        int size = val.length-1;
        int[][] dp = new int[size+1][capacity+1];

        for(int i = 0 ; i <= size; i++)
            Arrays.fill(dp[i],-1);

        System.out.println(knapsack(val,wt,size,capacity,dp));

    }
}