
import java.util.Arrays;


class Memoization {
     public static int maxRecursion(int size,int arr[],int[] dp) {
        if(size < 0) return 0;
        if(dp[size] != -1) return dp[size];
        if(size == 0) return arr[size];

        int pick = arr[size] + maxRecursion(size-2,arr,dp);
        int nonPick = maxRecursion(size-1,arr,dp);

        return dp[size] =  Math.max(pick,nonPick);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3};
        int size = nums.length;   

        int arr1[] = new int[size-1];
        int arr2[] = new int[size-1];
        int dp1[] = new int[size-1];
        int dp2[] = new int[size-1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int k = 0;
        for(int i = 0 ; i < size; i ++ ) {
            if( i > 0) {
                arr2[k] = nums[i];
                k += 1;
            }

            if( i < size-1) arr1[i] = nums[i];
        }

        System.out.println(Math.max( maxRecursion(size-2,arr1,dp1), maxRecursion(size-2,arr2,dp2)) );

    }
}