public class IDLengthValidationException extends Exception{
    public String message(String ID){
        return ID + " is not of valid length!\n";
    }
}
