package dsa_sheet;
import java.util.*;
public class dublicatearrayelements {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1; i++){
                if(nums[i]==nums[i=1]){
                    return true;
                }
        }
        return false;
    }
    public static void main(String[] args){
//        Input: nums = [1,2,3,1]
//        Output: true
        int[] array = {1,2,3,1};
       boolean result = containsDuplicate(array);
        System.out.println(result);

    }

}
