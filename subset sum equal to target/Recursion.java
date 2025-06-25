class  Recursion {

    public static boolean subsetSum(int[] arr,int i,int target,int size) {
        if(target == 0) return true;
        if(i >= size) return false;

        boolean nonTake = subsetSum(arr, i+1, target, size);
        boolean take = false;
        if(target >= arr[i]) take = subsetSum(arr, i + 1, target -  arr[i], size);

        return (nonTake || take);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;

        int size = arr.length;
        System.out.println(subsetSum(arr,0,target,size));
    }
}