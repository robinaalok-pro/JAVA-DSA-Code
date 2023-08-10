package dsa_sheet;

public class longrepeatcharacter {

    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l= 0, maxcount = 0, ret = 0;
        for (int r = 0; r <s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            maxcount = Math.max(maxcount ,arr[s.charAt(r) - 'A']);
            while((r-l +1) - maxcount >k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            ret = Math.max(ret, r-l+1);
        }
        return ret;
    }
    public static void main(String[] args){
        String s = "ABCDE";
        System.out.println(characterReplacement(s,1));
    }
}
