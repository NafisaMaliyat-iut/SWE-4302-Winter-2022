import java.util.Scanner;

//DetermineResponseType in enum codes prints out the specific words to print out for each 'case'
//PrintResponse in solution class decides function of element in enum to call based on a string
//finally, the main function takes in a string and passes it to PrintResponse
//the corresponding output is printed
//assumes the user enters the input perfectly with right spellings and right case
public class Solution {
    enum codes {
        C_400 {
            @Override
            void DetermineResponseType() {
                System.out.print("Bad request\n");
            }
        },

        C_401 {
            @Override
            void DetermineResponseType() {
                System.out.print("Unauthorized\n");
            }
        },

        C_403 {
            @Override
            void DetermineResponseType() {
                System.out.print("Forbidden\n");
            }
        },

        C_404 {
            @Override
            void DetermineResponseType() {
                System.out.print("Not Found\n");
            }
        },

        C_408 {
            @Override
            void DetermineResponseType() {
                System.out.print("Request Timeout\n");
            }
        };
        static void PrintResponse(String type) {
            if ("C_400".equals(type)) {
                C_400.DetermineResponseType();
            } else if ("C_401".equals(type)) {
                C_401.DetermineResponseType();
            } else if ("C_403".equals(type)) {
                C_403.DetermineResponseType();
            } else if ("C_404".equals(type)) {
                C_404.DetermineResponseType();
            } else if ("C_408".equals(type)) {
                C_408.DetermineResponseType();
            }
        };
        //defined based on the value of enum
        abstract void DetermineResponseType();
    }



    public static void main(String []argh) {
        String type;
        Scanner scan = new Scanner(System.in);
        type = scan.next();
        scan.close();

        codes.PrintResponse(type);
    }
}
