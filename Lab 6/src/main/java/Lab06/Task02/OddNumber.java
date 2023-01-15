package Lab06.Task02;

public class OddNumber implements IProperty<Integer>{
    @Override
    public boolean CheckProperty(Integer number) {
        if(number%2 == 1){
            return true;
        }
        else
            return false;
    }
}
