package dsa_sheet;

public class sumsortedarray {
    public static boolean sumarray(int nums[], int x){
        int i,n= nums.length;
        for (i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                break;
            }
        }
            int l = (i+1) % n;
            int r = i;
            while (l != r){
                if(nums[l]+nums[r]==x){
                    return true;
                }
                if(nums[l]+nums[r]<x){
                   l = (l + 1) % n;
                }
                else{
                    r=(n+r-1)%n;
                }
            }
        return false;
    }
    public static void main(String[] args){
//        Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 1
//        Output: true
        int[] nums = {11, 15, 6, 8, 9, 10};
        int x = 100;
        System.out.println(sumarray(nums,x));
    }
}

