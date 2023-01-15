import java.util.List;

public class PrintLists {

    //this class was created to print lists of employee in specific format
    //and a generic list printer
    public static void printEmployeeList(List<Employee> employees){
        for(Employee e: employees){
            System.out.println("ID: " + e.getID() + ", Name: " + e.getName() + ", Experience: " + e.getExperience()
                    + ", Age: " + e.getAge() + ", Salary: " + e.getSalary()) ;
        }
    }

    public static <T> void  printGenericList(List<T> List){
        for(T t: List){
            System.out.println(t);
        }
    }

}
