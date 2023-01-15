import java.util.List;

public class Exporter {

    public String exportList(IFormat format, List<Student> studentList){
        return format.getFile(studentList);
    }
}
