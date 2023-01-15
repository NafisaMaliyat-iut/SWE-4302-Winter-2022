package Lab06.Task02;

import java.io.IOError;

public class DivisibleBy3 implements IProperty<Integer> {

    @Override
    public boolean CheckProperty(Integer number) {
        if(number%3==0)
            return true;
        else
            return false;
    }
}
