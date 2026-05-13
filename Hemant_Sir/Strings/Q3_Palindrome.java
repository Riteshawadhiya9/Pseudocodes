package Hemant_Sir.Strings;

public class Q3_Palindrome {
    public static void main(String[] args) {
        String str = "Haramjada";
        int i = 0;
        int j = str.length()-1;

        boolean flag = false;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                flag = true;
                break;
            }
            i++;
            j--;
        }

        if(!flag){
            System.out.println(str + " is a Palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
