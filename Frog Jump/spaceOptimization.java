public class spaceOptimization {
    public static void main(String[] args) {
        int[] arr = {7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10};
        int n =  arr.length;

        int prev1 = 0 , prev2 = 0;
        for(int i = 1; i < n ; i ++) {
            int fs = prev1 + Math.abs(arr[i] - arr[i-1]);
            int sd ;
            if( i > 1) sd = prev2 + Math.abs(arr[i] -  arr[i-2]);
            else  sd = Integer.MAX_VALUE;

            prev2 = prev1;
            prev1 =  Math.min(fs, sd);

        }

        System.out.print(prev1);

    }
}