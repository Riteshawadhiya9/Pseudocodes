package Practice_Ques.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q3_More_than_once {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,4,5,1};
        ArrayList<Integer> result = moreThanOnce(arr);
        System.out.println("Elements that appear more than once : "+result);

//        for(int num : result){ you can print like this as well
//            System.out.print(num +" ");
//        }
    }
    public static ArrayList<Integer> moreThanOnce(int[]arr){
        HashMap<Integer , Integer> mp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int elem : arr){
            if(!mp.containsKey(elem)){
                mp.put(elem,1);
            }else{
                mp.put(elem, mp.get(elem)+1);
            }
        }

        for(var i : mp.entrySet()){
            if(i.getValue() > 1){
                list.add(i.getKey());
            }
        }
        return list;
    }
}
