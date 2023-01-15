import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultPublication {

    List<Student> studentList = new ArrayList<>();

    public List<Student> publishSortByID(){

        Collections.sort(studentList, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return s1.getID().compareTo(s2.getID());
            }
        });

        return studentList;
    }

    public List<Student> publishSortByName(){

        Collections.sort(studentList, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        return studentList;
    }

    public List<Student> publishSortByCGPA(){

        Collections.sort(studentList, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return Float.compare(s1.getCGPA(), s2.getCGPA());
            }
        });
        return studentList;
    }

    public List<Student> publishSortByCGPAThenID(){

        Collections.sort(studentList, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                int result = Float.compare(s1.getCGPA(), s2.getCGPA());
                if(result!=0)
                    return result;
                else
                    return s1.getID().compareTo(s2.getID());
            }
        });
        return studentList;
    }


}
