package dsa_sheet;

public class stematrixzero {
    public static void setZeroes(int[][] m) {
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[0].length ; j++) {
                if(m[i][j]==0){
                    
                }
            }
        }
    }
    public static void main(String[] args){
//        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//        Output: [[1,0,1],[0,0,0],[1,0,1]]
        int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(m);
    }
}
