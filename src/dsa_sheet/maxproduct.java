package dsa_sheet;

public class maxproduct {
    public static int maxProduct(int[] nums) {
        int maxpro = Integer.MIN_VALUE;
        int currentpro = 1,i;
        int r = nums[0];
        for(i=0; i< nums.length; i++){
            currentpro *= nums[i];
           maxpro = Math.max(maxpro,currentpro );

        if(nums[i]==0) currentpro = 1;
        }
        currentpro=1;

        for(i= nums.length-1; i>=0; i--) {
            currentpro *= nums[i];
            maxpro = Math.max(maxpro, currentpro);

            if (nums[i] == 0) {
                currentpro = 1;
            }
        }

        r = Math.max(r,maxpro);
        return r;
    }
    public static void main(String[] args){

//        Input:nums = {-1,-3,-10,0,60};
//        Output: 60
        int[] nums = {-1,-3,-10,0,60};

        System.out.println(maxProduct(nums));

    }
}
