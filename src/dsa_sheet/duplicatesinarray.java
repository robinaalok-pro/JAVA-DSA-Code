package dsa_sheet;

import java.util.Arrays;

public class duplicatesinarray {
    public static void printDuplicates(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        String sortedStr = new String(s);

        for (int i = 0; i < s.length-1; i++) {
            int count = 1;
            while(i<s.length-1 && (sortedStr.charAt(i)== sortedStr.charAt(i+1))){

                count++;
                i++;
            }
            if (count >1){
                System.out.println(sortedStr.charAt(i)
                        + ", count = " + count);
            }
        }
    }
    public static void main(String[] args){
//        input string be “geeksforgeeks”
//        Output s, count = 2
//        t, count = 3
        String s = "geeksforgeeks";
        printDuplicates(s);
    }
}
