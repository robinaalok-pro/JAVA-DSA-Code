package dsa_sheet;

public class palindromesubstrings {
    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i,j+1);
                if(check(substring)){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean check(String s) {
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        Input: s = "abc"
//        Output: 3
//        Explanation: Three palindromic strings: "a", "b", "c".
        String s = "aab";
        System.out.println(countSubstrings( s));
    }
}
