import java.awt.print.Printable;
import java.util.Scanner;

public class Solution {

    enum Directions{
            North {
                @Override
                public void FindCurrentDirection(){
                    System.out.print("I am in the North\n");
                }
                @Override
                public void FindNextDirection(){
                    System.out.print("I have to go South\n");
                }
            },

            South{
                @Override
                public void FindCurrentDirection(){
                    System.out.print("I am in the South\n");
                }
                @Override
                public void FindNextDirection(){
                    System.out.print("I have to go North\n");
                }

            },

            East {
                @Override
                public void FindCurrentDirection(){
                    System.out.print("I am in the East\n");
                }
                @Override
                public void FindNextDirection(){
                    System.out.print("I have to go West\n");
                }
            },

            West{
                @Override
                public void FindCurrentDirection(){
                    System.out.print("I am in the West\n");
                }
                @Override
                public void FindNextDirection(){
                    System.out.print("I have to go East\n");
                }
            };

            static void PrintDirections(String UserPosition){
                if(UserPosition.equals("North")){
                    North.FindCurrentDirection();
                    North.FindNextDirection();
                } else if(UserPosition.equals("South")){
                    South.FindCurrentDirection();
                    South.FindNextDirection();
                } else if(UserPosition.equals("East")){
                    East.FindCurrentDirection();
                    East.FindNextDirection();
                } else if(UserPosition.equals("West")){
                    West.FindCurrentDirection();
                    West.FindNextDirection();
                } else {
                    System.out.print("Check your input again!\n");
                }
            }

            abstract void FindCurrentDirection();
            abstract void FindNextDirection();
    }

    public static void main(String []argh) {
        String UserPosition;
        Scanner scan = new Scanner(System.in);
        UserPosition = scan.next();
        scan.close();

        Directions.PrintDirections(UserPosition);
    }
}
