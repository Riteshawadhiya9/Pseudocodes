package Pseudocodes;
import java.util.*;
public class Q4_Nested_if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUserId = "admin";
        String correctPassword = "1234";

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (userId.equals(correctUserId)) {

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }

        } else {
            System.out.println("Invalid User ID");
        }
    }
}


//START
//
//        DECLARE userId, password : STRING
//SET correctUserId ← "admin"
//SET correctPassword ← "1234"
//
//PRINT "Enter User ID"
//READ userId
//
//PRINT "Enter Password"
//READ password
//
//IF userId = correctUserId THEN
//
//IF password = correctPassword THEN
//PRINT "Login Successful"
//ELSE
//PRINT "Incorrect Password"
//END IF
//
//ELSE
//PRINT "Invalid User ID"
//END IF
//
//END
