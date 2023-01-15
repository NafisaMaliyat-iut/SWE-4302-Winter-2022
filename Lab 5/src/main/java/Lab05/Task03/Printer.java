package Lab05.Task03;

import java.util.ArrayList;
import java.util.List;

public class Printer <T extends Person> {

    List<T> listToPrint = new ArrayList<>();

    //adds to the list
    public void AddToList(T t){
        listToPrint.add(t);
    }

    public String printList(){
        String ListPrinted = "";
        for(int i = 0; i<listToPrint.size(); i++){
            ListPrinted += listToPrint.get(i).toString() + "\n";
        }

        return ListPrinted;
    }
}
