import java.util.*;
import java.io.*;


public class Solution {

    public static void DetermineResponseType(String s)
    {
        switch (s){
            case "C_400":
                System.out.print("Bad request\n");
                break;
            case "C_401":
                System.out.print("Unauthorized\n");
                break;
            case "C_403":
                System.out.print("Forbidden\n");
                break;
            case "C_404":
                System.out.print("Not Found\n");
                break;
            case "C_408":
                System.out.print("Request Timeout\n");
                break;
            default:
                System.out.print("Invalid Input\n");
                break;
        }
    }
    public static void main(String []argh){
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.next();

        DetermineResponseType(s);

    }
}
