package Practice_Ques.HashMap;

import java.util.HashMap;

public class Q9_Valid_Anagram {
    public static void main(String[] args) {
        String str = "anagram";
        String gtr = "nagaram";

        if(isAnagram(str,gtr)){
            System.out.println("\"" + str + "\" and \"" + gtr + "\" are valid anagrams.");
        }else {
            System.out.println("\"" + str + "\" and \"" + gtr + "\" are not valid anagrams.");
        }
    }
    public static boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;

        HashMap<Character , Integer> mp1 = makeFreqCnt(s);
        HashMap<Character , Integer> mp2 = makeFreqCnt(t);

        return mp1.equals(mp2);
    }

    private static HashMap<Character , Integer> makeFreqCnt(String s){
        HashMap<Character , Integer> mp = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch , 1);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
}
