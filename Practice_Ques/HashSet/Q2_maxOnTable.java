package Practice_Ques.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Q2_maxOnTable {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,1,2,3,3};

        int ans = maxOnTable(arr);
        System.out.println(ans);
    }
    private static int maxOnTable(int[] nums){
        Set<Integer> table = new HashSet<>();

        int maxx = 0;
        for(int num : nums){
            if(table.contains(num)){
                table.remove(num);
            }else{
                table.add(num);
            }
        maxx = Math.max(maxx , table.size());
        }

        return maxx;
    }
}

