package dsa_sheet;
import java.util.*;
public class chocodistribution {
    public static void maxmindiff(int[] nums, int m){
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i+m-1<nums.length; i++){
            int x =nums[i+m-1]-nums[i];
            if(x<diff){
                diff = x;
            }
        }
        System.out.println(diff);
    }
    public static void main(String[] args){
//        Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
//        Output: Minimum Difference is 2
       int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
       int m= 7;
        maxmindiff(arr, m);
    }
}
