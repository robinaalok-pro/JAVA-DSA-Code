package dsa_sheet;

public class nextpermutation {
     public static void nextPermutation(int[] nums) {
        int l = nums.length, i , j;
        for(i = l-2; i>=0; i--){
            if(nums[i]<nums[i+1]) {
                break;
            }
        }
        if(i<0){
            reverse(nums, 0 , nums.length-1);
        }
        else{
            for (j = l-1; j>i; j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            swap(nums,i,j);
            reverse(nums, i+1 , nums.length-1);
        }
    }
    static void reverse(int[] nums, int start , int end) {
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] nums, int i , int j) {
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
    }


    public static void main(String[] args){
//        Input: nums = [3,2,1]
//        Output: [1,2,3]

        int[] arr = {2,3,1};
        nextPermutation(arr);
        for(int i : arr){
            System.out.println(i + " ");
        }
    }
}
