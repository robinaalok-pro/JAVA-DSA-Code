package dsa_sheet;
import java.util.*;

public class tagerfind {
//    public static int search(int[] nums, int target) {
//        for(int i = 0; i<nums.length-1; i++)
//        {
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
public static int binarysearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            System.out.println("heelo");
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
    System.out.println("hii");
        return -1;
}
    public static void main(String[] args){
//        Input: nums = [4,5,6,7,0,1,2], target = 0
//        Output: 4
        int[] array = {4,5,6,7,0,1,2};
        System.out.println( binarysearch(array,0));
    }
}
//for(int i = 0; i<nums.length-1; i++)
//        {
//        if(nums[i]==target){
//        return i;
//        }
//        }
//        return -1;