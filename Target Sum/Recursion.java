class Recursion {

    public static int countPartition(int[] arr,int index,int sum) {
        if(index == 0) {
            if(sum == 0 || sum == arr[0]) return 1;
            return 0;
        }

        int take = countPartition(arr,index-1,sum - arr[index]);
        int nonTake = countPartition(arr,index-1,sum);

        return nonTake + take;

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
            System.out.println('0');
        
        else {
            System.out.println(countPartition(arr,size - 1,s2));
        }

    }
}