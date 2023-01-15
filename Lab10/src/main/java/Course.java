@DevelopmentHistory(version =3, developer="Zhongli", tester="Raiden")
public class Course {
    int code;
    String name;
    int credit;
    CourseType type;

    Course(int code, String name, int credit, CourseType type){
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
    }
}
