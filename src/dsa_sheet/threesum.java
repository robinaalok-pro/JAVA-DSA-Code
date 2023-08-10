package dsa_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    static List<List<Integer>> res = new ArrayList<>();
    static List<List<Integer>> threesumc(int[] nums){
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length ; i++) {
            if(i==0 || nums[i]!=nums[i-1]){
                threesumsorted(i+1, nums.length-1, nums, 0-nums[i]);
            }
        }
        return res;
    }
   static void threesumsorted(int i, int j, int[] nums, int k){
        int a1 = nums[i-1];
        while (i<j) {
            if (nums[i] + nums[j] > k) {
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                while (i < j && nums[i] == nums[i + 1]) i++;
                while (i < j && nums[j] == nums[j - 1]) j--;
                i++;
                j--;
            }
        }
   }
    static void main(String[] args){
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
        int[] nums = {-1,0,1,2,-1,-4};
        threesumc(nums);
    }
}
