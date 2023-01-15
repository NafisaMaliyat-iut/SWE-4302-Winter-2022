import java.util.List;

public class XMLFormat implements IFormat{
    @Override
    public String getFile(List<Student> studentList) {
        String xmlFile="";
        for(Student s : studentList ){
            xmlFile+="<Student>\n<ID>"+ s.getID() + "</ID>\n<Name>" + s.getName() + "</Name>\n<Program>" +
                   s.getProgram() +  "</Program>\n<CGPA>" + s.getCGPA()+ "</CGPA>\n</Student>\n";
        }

        return xmlFile;
    }


//    public void print(List<Student> students, String path) throws IOException {
//
//        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), "UTF-16");
//
//        for(Student student : students){
//            String line = student.print();
//
//            out.write("\n");
//            out.write(line);
//
//        }
//        out.close();
//
//
//    }
}
//
//package Lab09.Implementation;
//        import java.util.*;
//        import java.io.*;
//public class Exporter {
//
//
//
//    public void writeCSV(List<Student> students) throws IOException {
//        String csvFilePath = "D:\\Java Projects\\OOC-II\\Lab09\\test.csv";
//        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
//
////        StudentEnrollment studentEnrollment = new StudentEnrollment();
////        List<Student> students = studentEnrollment.getAll();
//
//        for (Student student : students){
//            String line = student.print();
//
//            fileWriter.newLine();
//            fileWriter.write(line);
//        }
//
//        fileWriter.close();
//    }
//
//    public void writeXML(List<Student> students) throws IOException{
//        String xmlFilePath = "D:\\Java Projects\\OOC-II\\Lab09\\test.xml";
////        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(xmlFilePath));
//        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(xmlFilePath), "UTF-16");
//
//        for(Student student : students){
//            String line = student.print();
//
//            out.write("\n");
//            out.write(line);
//
//        }
//        out.close();
//
//
//
//
//    }
//
//
//
//}


