import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Person person1 = new Person();
        Scanner scan = new Scanner(System.in);
        person1.PhoneNumber = scan.next();
        try{
            throw new InvalidFormatException(person1.PhoneNumber);
        }
        catch(InvalidFormatException e){
            e.ReturnStatus();
        }
    }
}
