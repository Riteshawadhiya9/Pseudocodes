package Practice_Ques.HashMap;

import java.util.HashMap;

public class Q1_Max_freq {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,4,1};
        findMax(arr);
    }
    private static void findMax(int[] arr){
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i : arr){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                int val = mp.get(i);
                mp.put(i, val+1);
            }
        }
        System.out.print("Frequencies : ");
        System.out.println(mp.entrySet());

        int maxFreq = 0;
        int ansKey = -1;
        for(var i : mp.entrySet()){
            if(i.getValue() > maxFreq){
                maxFreq = i.getValue();
                ansKey = i.getKey();
            }
        }
        System.out.printf("%d has max Frequency and it occures %d times ",ansKey,maxFreq);
    }
}
