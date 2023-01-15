import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExporterTest {
    @Test
    public void csvExportTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        CSVFormat csvFormat = new CSVFormat();
        String expected = "123456789, B, SWE, 3.45\n123456987, A, IT, 3.95\n987654321, C, CSE, 3.15\n";
        assertEquals(expected, csvFormat.getFile(studentList));
    }

    @Test
    public void xmlExportTest(){
        Student s1 = new Student();
        s1.setStudentInfo("123456789", "B", ProgramType.SWE, 3.45f);
        Student s2 = new Student();
        s2.setStudentInfo("123456987", "A", ProgramType.IT, 3.95f);
        Student s3 = new Student();
        s3.setStudentInfo("987654321", "C", ProgramType.CSE, 3.15f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        XMLFormat xmlFormat = new XMLFormat();
        String expected = "<Student>\n<ID>123456789</ID>\n" +
                "<Name>B</Name>\n<Program>SWE</Program>\n<CGPA>3.45</CGPA>\n</Student>\n" +
                "<Student>\n<ID>123456987</ID>\n<Name>A</Name>\n<Program>IT</Program>\n" +
                "<CGPA>3.95</CGPA>\n</Student>\n" +
                "<Student>\n<ID>987654321</ID>\n<Name>C</Name>\n<Program>CSE</Program>\n" +
                "<CGPA>3.15</CGPA>\n</Student>\n";

        assertEquals(expected, xmlFormat.getFile(studentList));
    }
}
