class Recursion {

    public static int MinimumFallingSum(int[][] arr,int r,int c,int size) {
        if(r == size-1) return arr[r][c];

        int result = Integer.MAX_VALUE;
        for(int i = 0; i < size; i ++) {
            if( i != c)
                result =  Math.min(result, arr[r][c] + MinimumFallingSum(arr, r+1, i, size));
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };

        int size = arr.length;

        int maximum = Integer.MAX_VALUE;
        for(int i = 0 ; i < size; i ++) {
            maximum = Math.min(maximum, MinimumFallingSum(arr,0,i,size));
        }

        System.out.println(maximum);
    }
}