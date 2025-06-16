
public class Recursion {

    public static int minimumPath(int[][] arr,int m,int n) {
        if(m == 0 && n == 0) return arr[0][0];
        if( m < 0 || n < 0) return 99999;

        int top = arr[m][n] + minimumPath(arr, m-1, n);
        int left = arr[m][n] + minimumPath(arr, m, n-1);

        return Math.min(top,left);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,5,1}
        };

        int m = arr.length-1;
        int n = arr[0].length-1;

        System.out.println(minimumPath(arr,m,n));
    }
}