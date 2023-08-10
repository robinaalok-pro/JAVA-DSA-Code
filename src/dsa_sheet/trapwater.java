package dsa_sheet;

public class trapwater {
   static void trapwter(int[] height){
       int n = height.length;
       int[] leftmax = new int[n];
       leftmax[0] = height[0];
       for(int i=1; i< height.length; i++){
           leftmax[i] = Math.max(height[i],leftmax[i-1]);
       }
       int[] rightmax = new int[n];
       rightmax[n-1] = height[n-1];
       for(int i=n-2; i>=0; i--){
           rightmax[i] = Math.max(height[i],rightmax[i+1]);
       }

       int trapwater = 0;
       for(int i=0; i<height.length; i++){
           int waterlevel = Math.min(rightmax[i], leftmax[i]);
           trapwater += waterlevel - height[i];
       }
       System.out.println(trapwater);
   }
    public static void main(String[] args){
//        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        trapwter(array);
    }
}
