package dsa_sheet;
import java.util.*;

public class groupanargams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String i: strs ){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sortedarr = String.valueOf(chars);

            if(!map.containsKey(sortedarr)){
                map.put(sortedarr, new ArrayList<>());
            }
            map.get(sortedarr).add(i);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
