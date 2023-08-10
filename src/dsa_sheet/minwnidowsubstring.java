package dsa_sheet;

import java.util.*;

public class minwnidowsubstring {
    public static String minWindow(String s, String t) {
        if (s.length()==0 || s.length()<t.length())return "";
        HashMap<Character, Integer> map= new HashMap();
        for (char ch : t.toCharArray()){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch,1);
            }
        }
        int count = 0, start = 0;
        int minilength = Integer.MAX_VALUE;
        int minleft = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))>=0){
                    count++;
                }
            }

            while(count==t.length()) {
                if (minilength > i - start + 1) {
                    minilength = i - start + 1;
                    minleft = start;
                }
                if (map.containsKey(s.charAt(start))) {
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    if (map.get(s.charAt(start)) > 0) {
                        count--;
                    }
                }
                start++;
            }
        }
        if(minilength>s.length())return "";
        return s.substring(minleft,minleft+minilength);
    }

    public static void main(String[] args){
//        Input: s = "ADOBECODEBANC", t = "ABC"
//        Output: "BANC"
//        Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
