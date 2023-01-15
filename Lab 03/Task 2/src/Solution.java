import java.util.*;
import java.io.*;

public class Solution {
    public static String FindCurrentPosition(){
        Scanner scan = new Scanner(System.in);
        String pos = scan.next();
        return pos;
    }

    public static void WhereToGo(String pos){
        switch(pos){
            case "North":
                System.out.print("I have to go South");
                break;
            case "South":
                System.out.print("I have to go North");
                break;
            case "East":
                System.out.print("I have to go West");
                break;
            case "West":
                System.out.print("I have to go East");
                break;
            default:

        }
    }

    public static void main(String []argh) {
        String pos = FindCurrentPosition();
        System.out.print("I am in the " + pos + "\n");
        WhereToGo(pos);
    }
}
