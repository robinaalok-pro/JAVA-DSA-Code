package dsa_sheet;

public class minrotatedarry {
    public static void findMin(int[] nums) {
        int i,j=0;
        for ( i = 0; i<nums.length-1 ; i++) {
            if(nums[i]>nums[i+1]){
                j=nums[i+1];
                break;
            }
        }

        if(j==0){
            if(i==nums.length-1){
                System.out.println(nums[0]);
            }
        }

        else{
            System.out.println(j);
        }
        System.out.println(3%6);
    }
    public static void main(String[] args){
//    Input: nums = [3,4,5,1,2]
//    Output: 1
        int[] nums = {4,5,6,7,0,1,2};
       findMin(nums);
        
    }
}
