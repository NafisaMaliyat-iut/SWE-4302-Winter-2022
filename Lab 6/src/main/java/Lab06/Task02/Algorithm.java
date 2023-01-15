package Lab06.Task02;

import java.util.List;

public class Algorithm <T>{

    public int countIf(List<T> tList, IProperty<T> iProperty){
        int count = 0;
        for(int i=0; i<tList.size(); i++){
            if(iProperty.CheckProperty(tList.get(i)) == true)
                count++;
        }

        return count;
    }
}
