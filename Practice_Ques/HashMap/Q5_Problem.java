package Practice_Ques.HashMap;

import java.util.HashMap;

public class Q5_Problem {
    public static void main(String[] args) {
        String[]names = new String[]{"Alice", "Bob", "Alice", "Charlie"};
        int[] rollNo = new int[]{101,102,103,104};

        HashMap<String, Integer> result = mapStudents(names, rollNo);
        System.out.println(result);
    }
    private static HashMap<String, Integer> mapStudents(String [] names, int[] rollNo){
        if (names.length != rollNo.length) {
            throw new IllegalArgumentException("Array lengths must be equal.");
        }
        HashMap<String , Integer> mp = new HashMap<>();
        for(int i = 0 ; i < names.length ; i++){
            if(!mp.containsKey(names[i])){
                mp.put(names[i] , rollNo[i]);
            }
        }
        return mp;
    }
}


//Ques : A school has lost track of student IDs after a system crash. They have two lists: one with student names
// and another with their corresponding roll numbers. But some roll numbers are missing, and some names have
// duplicates. Create a system to map each unique student name to their roll number. If a name appears multiple
// times, keep the first occurrence's roll number.
//Problem: Given two arrays names and rollNumbers of same length, create a HashMap that maps each unique
// name to its first corresponding roll number.

//Input:
//names = ["Alice", "Bob", "Alice", "Charlie"]
//rollNumbers = [101, 102, 103, 104]
//
//Output: {Alice=101, Bob=102, Charlie=104}