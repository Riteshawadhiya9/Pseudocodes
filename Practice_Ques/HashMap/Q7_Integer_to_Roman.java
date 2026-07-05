package Practice_Ques.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q7_Integer_to_Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int num = sc.nextInt();

        String ans = romanToInt(num);
        System.out.println("Output : "+ans);
    }

    private static String romanToInt(int num){
        Map<Integer , String> mp = new LinkedHashMap<>();
        mp.put(1000, "M");
        mp.put(900, "CM");
        mp.put(500, "D");
        mp.put(400, "CD");
        mp.put(100, "C");
        mp.put(90, "XC");
        mp.put(50, "L");
        mp.put(40, "XL");
        mp.put(10, "X");
        mp.put(9, "IX");
        mp.put(5, "V");
        mp.put(4, "IV");
        mp.put(1, "I");

        StringBuilder sb = new StringBuilder();

        for(var n : mp.entrySet()){
            int val = n.getKey();
            String symbol = n.getValue();

            while(val <= num){
                sb.append(symbol);
                num -= val;
            }
        }
        return sb + "";
    }
}


//Input: num = 3749

//Output: "MMMDCCXLIX"

//  Symbol	Value
//    I	      1
//    V       5
//	  X       10
//	  L       50
//    C       100
//	  D       500
//    M       1000
