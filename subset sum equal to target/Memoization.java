import java.util.Arrays;

class Memoization {

    public static boolean subsetSum(int[] arr,int index,int target, int size, boolean [][] dp) {
        if(target == 0) return true;
        if(index >= size) return false;
        if(dp[index][target]) return dp[index][target];

        boolean nonTake = subsetSum(arr, index+1, target, size,dp);
        boolean take = false;
        if(target >= arr[index]) take = subsetSum(arr, index + 1, target -  arr[index], size,dp);

        return dp[index][target] =  (nonTake || take);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;

        int size = arr.length;

        boolean[][] dp = new boolean[size][target+1]; 

        for(int i = 0  ; i < size; i++)     
            Arrays.fill(dp[i],false);

        System.out.println(subsetSum(arr,0,target,size,dp));
    }
}