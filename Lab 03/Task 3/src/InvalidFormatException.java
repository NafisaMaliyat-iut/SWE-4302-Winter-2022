public class InvalidFormatException extends Exception{
    String phoneNumber;

    InvalidFormatException(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    boolean NumberOfDigitsChecker(){
        int digits = 0;
        for (int i = 0; i < this.phoneNumber.length(); i++) {
            if (this.phoneNumber.charAt(i) >= 48 && this.phoneNumber.charAt(i) <= 57)
                digits++;
        }
        return digits == 8;
    }

    boolean UnderscoreValidator(){
        if(this.phoneNumber.contains("_"))
            return true;
        else
            return false;
    }

    public void ReturnStatus(){
        if(UnderscoreValidator() &&  NumberOfDigitsChecker())
            System.out.print("Ok\n");
        else
            System.out.print("Not Ok\n");
        }

}

