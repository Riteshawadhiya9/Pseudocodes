package Practice_Ques.HashMap;

import java.util.HashMap;
import java.util.Map;

// 1. Same character should always map to the same character.
// 2. Two different characters cannot map to the same character.
// 3. Mapping should be one-to-one.

public class Q11_Isomorphic_String {

    public static void main(String[] args) {

        String str = "egg";
        String gtr = "add";

        if (isIsomorphic(str, gtr)) {
            System.out.println("\"" + str + "\" and \"" + gtr + "\" are Isomorphic Strings.");
        } else {
            System.out.println("\"" + str + "\" and \"" + gtr + "\" are NOT Isomorphic Strings.");
        }
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if (mp.containsKey(sCh)) { // if this condition is true no one block will execute..

                if (mp.get(sCh) != tCh) {
                    return false;
                }

            } else if (mp.containsValue(tCh)) {

                return false;

            } else {

                mp.put(sCh, tCh);
            }
        }

        return true;
    }
}