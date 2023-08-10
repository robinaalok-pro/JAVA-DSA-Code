package dsa_sheet;
import java.util.*;
public class maxsubarray {
    public static void main(String[] args){
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        int[] array = {-3,-1,-1};
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 1;
        for(int i=0; i< array.length; i++){
            currentsum *= array[i];
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            if(currentsum < 0)
            {
                currentsum = 0;
            }
        }
        System.out.println("maximum sum of subarray " +  maxsum);
    }
}
