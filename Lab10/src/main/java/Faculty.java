import java.util.ArrayList;

@DevelopmentHistory(version =3, developer="Zhongli", tester="Raiden")
public class Faculty {
    String name;
    String designation;
    double salary;
    ArrayList<Course> courses = new ArrayList<>();


    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 3.2,
            developer="Sayu", tester="Yae Miko"),
            reviewers = {"Venti", "Itto"})
    public Faculty(String name, String designation, double salary, ArrayList<Course> courses){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courses;
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 5.1,
            developer="Lomatul", tester="Zayed"),
            reviewers = {"Ayesha"})
    public Faculty(String name, String designation, double salary){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }


    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 3.3,
            developer="Rozaria", tester="Al Haitham"),
            reviewers = {"Gorou", "Diona"})
    public String teach(CourseType type){
        String teaching = "Course type taught: " + type;
        return teaching;
    }

    public String research(String topic){
        String researching = "Research topic: " + topic;
        return researching;
    }
}
