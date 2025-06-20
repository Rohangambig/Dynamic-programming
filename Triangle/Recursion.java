
public class Recursion {

    static int MinimumPath(int[][] arr,int i ,int j,int size) {
        if(i == size-1) return arr[size-1][j];

        int bottom = arr[i][j] + MinimumPath(arr, i+1, j, size);
        int right = arr[i][j] + MinimumPath(arr, i+1, j+1, size);

        return Math.min(bottom,right);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };

        int size = arr.length;

        System.out.println(MinimumPath(arr,0,0,size));

    }
}