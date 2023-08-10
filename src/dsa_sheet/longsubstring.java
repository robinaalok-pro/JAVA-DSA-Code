package dsa_sheet;

import java.util.HashMap;

public class longsubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> sb = new  HashMap<Character,Integer>();
        int len = 0, right = 0, left = 0;
        int n = s.length();
        while (right<n){
            if(sb.containsKey(s.charAt(right)))
                left = Math.max(sb.get(s.charAt(right)) + 1, left);
            sb.put(s.charAt(right), right);
            len = Math.max(len, right - left +1);
            right++;
        }

        return len;
    }

    public static void main(String[] args){
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
