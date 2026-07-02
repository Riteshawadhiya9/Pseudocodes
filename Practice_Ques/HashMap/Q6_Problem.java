package Practice_Ques.HashMap;

import java.util.HashMap;

public class Q6_Problem {
    public static void main(String[] args) {
        int[] votedIDs = new int[]{101, 102, 103, 104};
        int[] newVoters = new int[]{101, 105, 102, 106};
        int ans = findVoters(votedIDs , newVoters);
        System.out.println("Number of voters who have already voted: " + ans);
    }

    private static int findVoters(int[] votedIDs , int [] newVoters){
        HashMap<Integer , Integer> mp = new HashMap<>();
            for (int id : votedIDs) {
                mp.put(id, 1);
            }
            int cnt = 0;
            for (int id : newVoters) {
                if (mp.containsKey(id)) {
                    cnt++;
                }
            }
        return cnt;
    }
}

//Ques : An election commission needs to verify if a person has already voted. They have a list of voter IDs who have voted.
// Given a new list of people, determine how many of them have already voted. Each person has a unique voter ID.

//Problem: Given two arrays votedIDs (people who already voted) and newVoters (people coming to vote),
// return the count of new voters who have already voted.

//Input:
//votedIDs = [101, 102, 103, 104]
//newVoters = [101, 105, 102, 106]
//
//Output: 2
//        (101 and 102 have already voted)