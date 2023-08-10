package dsa_sheet;

public class removeconschar {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char ch: s.toCharArray()) {
            if(i>0 && sb.charAt(i-1)==ch){
                sb.deleteCharAt(i-1);
                i--;
            } else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
//        S = aabb
//        Output:  ab
//        Explanation: 'a' at 2nd position is
//        appearing 2nd time consecutively.
//                Similiar explanation for b at
//        4th position.
        String s = "aab";
        System.out.println(removeDuplicates(s));
    }
}
