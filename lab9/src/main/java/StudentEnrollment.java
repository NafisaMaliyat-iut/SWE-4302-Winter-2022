import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    public List<Student> studentsList = new ArrayList<>();

    //add by student object
    public void addStudent(Student student){
        studentsList.add(student);
    }

    //get student by student object
    public String getStudent(Student student){
        for(Student s : studentsList){
            if(s == student){
                return s.toString();
            }
        }
        return "Student not found!\n";
    }

    //print whole student list
    public String printStudentList(){
        String list="";
        for(Student s : studentsList){
            list+= s.toString();
        }

        return list;
    }

    //remove by ID
    public void removeStudent(String ID){
        for(Student s : studentsList){
            if(s.ID == ID){
                studentsList.remove(s);
                break;
            }
        }
    }

    //get by ID
    public String getStudent(String ID){
        for(Student s : studentsList){
            if(s.ID == ID){
                return s.toString();
            }
        }
        return "Student not found!\n";
    }

    //remove by student object
    public void removeStudent(Student student){
        for(Student s : studentsList){
            if(s == student){
                studentsList.remove(s);
            }
        }
    }



    //getAll
    public List<Student> getAllStudent(){
        return studentsList;
    }


}
