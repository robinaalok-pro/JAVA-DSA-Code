package dsa_sheet;

public class longpalindromesubstring {
    public static String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int even = substring(s,i,i+1);
            int odd = substring(s,i,i);
            int len =  Math.max(even,odd);
            if(len>end-start){
                start = i - (len-1)/2;
                end = i + (len)/2;
            }
        }
        return s.substring(start, end+1);
    }
   static int substring(String s, int j, int k) {
        while(j>=0 && k<s.length() && s.charAt(j)== s.charAt(k)){
            j--;
            k++;
        }
        return k-j-1;
    }
    public static void main(String[] args) {
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
