package Practice_Ques.HashMap;

import java.util.HashMap;

public class Q2_First_Occurance {
    public static void main(String[] args) {
        String str = "aabbcdde";
        int ans = firstOccurance(str);
        if(ans == -1){
            System.out.println("No unique character found");
        } else {
            System.out.println("First unique character: " + (char)ans);
        }
    }
    private static int firstOccurance(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(char el : s.toCharArray()){
            if(mp.containsKey(el) == false){
                mp.put(el,1);
            }else{
                int val = mp.get(el);
                mp.put(el,val+1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(mp.get(ch) == 1){
                return ch;  // char will be automatically converted to int (ASCII value)
            }
        }
        return -1;
    }
}
