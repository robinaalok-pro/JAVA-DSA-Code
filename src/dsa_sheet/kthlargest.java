package dsa_sheet;

import java.util.PriorityQueue;

public class kthlargest {
    public static void kth(int[] nums, int k){
        PriorityQueue <Integer> kl = new PriorityQueue<>();
        for(int i= 0; i<k; i++){
            kl.add(nums[i]);
        }
        for(int i= 0; i<nums.length-1; i++){
            if(kl.peek()<nums[i]){
                kl.poll();
                kl.add(nums[i]);
            }
        }
        System.out.println(kl.peek());
    }
    public static void main(String[] args){
//        Input: nums = [3,2,1,5,6,4], k = 2
//        Output: 5
        int[] nums = {3,2,3,1,2,4,5,5,6};
        kth(nums, 4);

    }
}
