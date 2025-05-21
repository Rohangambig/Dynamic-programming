import java.util.ArrayList;
import java.util.Arrays;

public class SpaceOptimization {
    public static void main(String[] args) {
        ArrayList<Integer> nums =  new ArrayList<>(Arrays.asList(2 ,1 ,4 ,9));
        int size = nums.size()-1;

        int prev1 = nums.get(0);
        int prev2 = 0;


        for(int i= 1; i <= size; i++) {
            int pick = nums.get(i); 
            if(i > 1) pick += prev2;

            int nonPick = prev1;
            
            prev2 = prev1;
            prev1 = Math.max(pick, nonPick);
        }

        System.out.println(prev1);

    }
}