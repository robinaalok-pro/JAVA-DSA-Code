package dsa_sheet;

public class containerwater {
    static int water(int[] nums){
        int lp=0,rp= nums.length-1, area,maxwater=0;

        while (lp<rp){
            int ht = Math.min(nums[lp],nums[rp]);
            int width = rp-lp;
            area = ht * width;
            maxwater = Math.max(maxwater,area);
            if(nums[lp]<nums[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
            return maxwater;
    }
    public static void main(String[] args){
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(water(nums));
    }
}
