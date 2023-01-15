package Lab08.SRPVio1;

import java.util.List;

public class Journal {
    List<String> entries;
    String journalName;

    public Journal(String journalName){
        this.journalName = journalName;
    }

    public void addEntries(List<String> entries){
        for(int i=0; i<entries.size(); i++){
            this.entries.add(entries.get(i));
        }

    }

    public void addEntry(String entry){
        this.entries.add(entry);
    }

    public void removeEntry(String entry){
        for(int i=0; i<this.entries.size(); i++){
            if(this.entries.get(i) == entry){
                this.entries.remove(i);
            }
        }
    }


    public String toString(){
        String entries ="";
        for(int i=0; i<this.entries.size(); i++){
            entries+=this.entries.get(i);
        }
        return entries;
    }
}
