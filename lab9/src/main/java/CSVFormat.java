import java.util.List;

public class CSVFormat implements IFormat{
    @Override
    public String getFile(List<Student> studentList) {
        String csvFile="";
        for(Student s : studentList ){
            csvFile+= s.getID() + ", " + s.getName() + ", " +
                    s.getProgram() +  ", " + s.getCGPA()+ "\n";
        }

        return csvFile;
    }
}
