package dsa_sheet;

public class validpalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        if(s.isEmpty()){
            return true;
        }
//        s = s.toLowerCase();
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!Character.isLetterOrDigit(ch1)){
                i++;
            }
            else if(!Character.isLetterOrDigit(ch2)){
                j--;
            } else {
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
