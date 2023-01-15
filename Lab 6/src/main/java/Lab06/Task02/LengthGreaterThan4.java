package Lab06.Task02;

public class LengthGreaterThan4 implements IProperty<String>{

    @Override
    public boolean CheckProperty(String string) {
        if(string.length()>4){
            return true;
        }
        else
            return false;
    }
}
