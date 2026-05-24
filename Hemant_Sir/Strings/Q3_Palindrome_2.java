package Hemant_Sir.Strings;

public class Q3_Palindrome_2 {
    public static void main(String[] args) {
        String str = "nitin";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb + ""; // Converting StringBuilder to String
        if(str.equals(rev)){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
