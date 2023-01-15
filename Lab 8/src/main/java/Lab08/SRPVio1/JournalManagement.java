package Lab08.SRPVio1;

import java.util.ArrayList;
import java.util.List;

public class JournalManagement {
    List<Journal> journalList;

    public void Save(String journalName, String entry){
        for(int i=0; i<journalList.size(); i++){
            if(journalList.get(i).journalName == journalName)
                journalList.get(i).addEntry(entry);
        }
    }


    public void Save(String journalName, List<String> entries){
        for(int i=0; i<journalList.size(); i++){
            if(journalList.get(i).journalName == journalName)
                journalList.get(i).addEntries(entries);
        }
    }


    public List<String> load(String journalName) {
        List<String> loadEntries = null;

        for (int i = 0; i < journalList.size(); i++) {
            if (journalList.get(i).journalName == journalName)
                loadEntries.add(journalList.get(i).toString());
        }

        return loadEntries;
    }

}
