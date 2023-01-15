package Lab05.Task03;

public class Student extends Person{
    int StudentID;

    @Override
    public String toString() {
        return super.toString() + " " + StudentID;
    }

    public Student(String name, String address, int age, int StudentID){
        super(name, address, age);
        this.StudentID = StudentID;
    }
}
