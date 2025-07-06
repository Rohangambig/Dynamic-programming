import java.util.Arrays;
class Memoization {

    public static int countPartition(int[] arr,int index,int sum,int[][] dp) {
        if(index == 0) {
            if (sum == 0 && arr[0] == 0) return 2;
            if(sum == 0 || sum == arr[0]) return 1;
            return 0;
        }

        if( dp[index][sum] != -1 ) return dp[index][sum];

        int take = 0;
        if(sum >= arr[index]) take = countPartition(arr,index-1,sum - arr[index],dp);
        int nonTake = countPartition(arr,index-1,sum,dp);

        return dp[index][sum] = nonTake + take;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int d = 3;
        int size = arr.length;

        int sum = 0;
        for(int num: arr)
            sum += num ;

        int s2 = (sum - d) / 2;
    

        if(sum - d < 0 || (sum - d) % 2 != 0) 
            System.out.println(0);
    
        
        else {
            int[][] dp = new int[size][s2+1];

            for(int i = 0 ; i < size; i++)
                Arrays.fill(dp[i],-1);
            System.out.println(countPartition(arr,size - 1,s2,dp));
        }

    }
}