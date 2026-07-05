package Practice_Ques.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8_Roman_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roman number : ");
        String str = sc.next();

        int ans = romanToInt(str);
        System.out.println("Output : "+ans);
    }

    private static int romanToInt(String s){
        Map<Character , Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        int cnt = 0;
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            int curr = mp.get(s.charAt(i));

            if(i < n-1 && curr < mp.get(s.charAt(i+1))){
                cnt -= curr;
            }else{
                cnt += curr;
            }
        }
        return cnt;
    }
}
