import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultPublisherTest {

    @Test
    public void sortByIDTest(){
        //mock object
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);


        ResultPublication resultPublication = new ResultPublication();
        resultPublication.studentList.add(s1);
        resultPublication.studentList.add(s2);
        resultPublication.studentList.add(s3);

        //SORT BY ID
        resultPublication.publishSortByID();
        assertEquals("123456789", resultPublication.studentList.get(0).getID());
        assertEquals("123456987", resultPublication.studentList.get(1).getID());
        assertEquals("987654321", resultPublication.studentList.get(2).getID());
    }


    @Test
    public void SortByCGPA(){
        //mock object
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);


        ResultPublication resultPublication = new ResultPublication();
        resultPublication.studentList.add(s1);
        resultPublication.studentList.add(s2);
        resultPublication.studentList.add(s3);

        //SORT BY CGPA
        resultPublication.publishSortByCGPA();
        assertEquals(3.15f, resultPublication.studentList.get(0).getCGPA());
        assertEquals(3.45f, resultPublication.studentList.get(1).getCGPA());
        assertEquals(3.95f, resultPublication.studentList.get(2).getCGPA());
    }

    @Test
    public void SortByName(){
        //mock object
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);


        ResultPublication resultPublication = new ResultPublication();
        resultPublication.studentList.add(s1);
        resultPublication.studentList.add(s2);
        resultPublication.studentList.add(s3);

        //SORT BY NAME
        resultPublication.publishSortByName();
        assertEquals("A", resultPublication.studentList.get(0).getName());
        assertEquals("B", resultPublication.studentList.get(1).getName());
        assertEquals("C", resultPublication.studentList.get(2).getName());
    }

    @Test
    public void SortByCGPAThenID(){
        //mock object
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);


        ResultPublication resultPublication = new ResultPublication();
        resultPublication.studentList.add(s1);
        resultPublication.studentList.add(s2);
        resultPublication.studentList.add(s3);

        //SORT BY CGPA AND ID
        Student s4 = new Student();
        s4.setStudentInfo("456123789", "D", ProgramType.CSE, 3.45f);
        resultPublication.studentList.add(s4);

        resultPublication.publishSortByCGPAThenID();
        assertEquals("987654321", resultPublication.studentList.get(0).getID());
        assertEquals(3.15f, resultPublication.studentList.get(0).getCGPA());

        assertEquals("123456789", resultPublication.studentList.get(1).getID());
        assertEquals(3.45f, resultPublication.studentList.get(1).getCGPA());

        assertEquals("456123789", resultPublication.studentList.get(2).getID());
        assertEquals(3.45f, resultPublication.studentList.get(2).getCGPA());

        assertEquals("123456987", resultPublication.studentList.get(3).getID());
        assertEquals(3.95f, resultPublication.studentList.get(3).getCGPA());
    }

}
