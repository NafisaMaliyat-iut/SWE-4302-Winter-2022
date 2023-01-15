import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentEnrollmentTest {
    StudentEnrollment studentEnrollment;
    StudentEnrollment studentEnrollmentMock =mock(StudentEnrollment.class);
    @BeforeEach
    void setUp(){
        studentEnrollment = new StudentEnrollment();
        studentEnrollment.add("123456789", "A", ProgramType.SWE, 3.45f);
        //blah blah
    }

    //ADD STUDENT METHOD
    @Test
    public void AddStudentTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.addStudent(s1);
        studentEnrollment.addStudent(s2);
        studentEnrollment.addStudent(s3);

        assertEquals(3, studentEnrollment.studentsList.size());
        assertEquals("123456789", studentEnrollment.studentsList.get(0).getID());
        assertEquals("123456987", studentEnrollment.studentsList.get(1).getID());
        assertEquals("987654321", studentEnrollment.studentsList.get(2).getID());
    }



    //GET ALL METHOD
    @Test
    public void GetAllStudent(){
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        //adding to test student list
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);


        assertEquals(studentList, studentEnrollment.getAllStudent());
    }

    //GET STUDENT BY OBJ METHOD
    @Test
    public void GetStudentByObjectTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        //WILL NOT BE ADDED
        //FOR TESTING NOT FOUND CONDITION
        Student s4 = new Student();
        s4.setStudentInfo("111111111", "D", ProgramType.CSE, 2.05f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);

        assertEquals("Student ID: 123456789, Student Name: A, Program: SWE, CGPA: 3.45\n", studentEnrollment.getStudent(s1));
        assertEquals("Student ID: 123456987, Student Name: B, Program: IT, CGPA: 3.95\n", studentEnrollment.getStudent(s2));
        assertEquals("Student ID: 987654321, Student Name: C, Program: CSE, CGPA: 3.15\n", studentEnrollment.getStudent(s3));
        assertEquals("Student not found!\n", studentEnrollment.getStudent(s4));
    }


    //GET STUDENT BY ID
    @Test
    public void GetStudentByIDTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        //WILL NOT BE ADDED
        //FOR CHECKING NOT FOUND CONDITION
        Student s4 = new Student();
        s4.setStudentInfo("111111111", "D", ProgramType.CSE, 2.05f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);

        String expected = "Student ID: 123456789, Student Name: A, Program: SWE, CGPA: 3.45\n";
        assertEquals( expected, studentEnrollment.getStudent("123456789"));

        expected = "Student ID: 123456987, Student Name: B, Program: IT, CGPA: 3.95\n";
        assertEquals( expected, studentEnrollment.getStudent("123456987"));

        expected = "Student ID: 987654321, Student Name: C, Program: CSE, CGPA: 3.15\n";
        assertEquals( expected, studentEnrollment.getStudent("987654321"));

        expected = "Student not found!\n";
        assertEquals(expected, studentEnrollment.getStudent("111111111"));
    }


    //PRINT STUDENT LIST
    @Test
    public void PrintStudentListTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);


        String expected="Student ID: 123456789, Student Name: A, Program: SWE, CGPA: 3.45\n" +
                "Student ID: 123456987, Student Name: B, Program: IT, CGPA: 3.95\n" +
                "Student ID: 987654321, Student Name: C, Program: CSE, CGPA: 3.15\n";

        assertEquals(expected, studentEnrollment.printStudentList());
    }


    //REMOVE BY ID
    @Test
    public void RemoveStudentByIDTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        //WILL NOT BE ADDED
        //FOR CHECKING NOT FOUND CONDITION
        Student s4 = new Student();
        s4.setStudentInfo("111111111", "D", ProgramType.CSE, 2.05f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);


        studentEnrollment.removeStudent("123456789");
        assertEquals(2, studentEnrollment.studentsList.size());
        studentEnrollment.removeStudent("111111111");
        assertEquals(2, studentEnrollment.studentsList.size());
    }


    //REMOVE BY OBJ
    @Test
    public void RemoveStudentByObjectTest(){
        //expected
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "A", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "B", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        //WILL NOT BE ADDED
        //FOR CHECKING NOT FOUND CONDITION
        Student s4 = new Student();
        s4.setStudentInfo("111111111", "D", ProgramType.CSE, 2.05f);

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        //adding to student enrollment list
        studentEnrollment.studentsList.add(s1);
        studentEnrollment.studentsList.add(s2);
        studentEnrollment.studentsList.add(s3);


        studentEnrollment.removeStudent(s2);
        assertEquals(2, studentEnrollment.studentsList.size());
        studentEnrollment.removeStudent(s4);
        assertEquals(2, studentEnrollment.studentsList.size());
    }


}
