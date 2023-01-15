package Lab05.Task01;

public class FizzBuzz {

    public String getFizzyBuzz(int number){
        if(number%21 == 0){
            return "Fizzbuzz";
        }
        else if(number%7 == 0){
            return "Buzz";
        }
        else if (number%3 == 0){
            return "Fizz";
        }
        else{
            return "Gotcha";
        }
    }
}
