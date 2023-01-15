import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Solution {

    public static void main(String[] args){
        EmployeeDB employeeDB = new EmployeeDB();


        //TASK 01
        Employee employee1 = new Employee(1234, "Ganyu", 21, 1235.12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD-MM-yyyy");
        try{
            Date date = simpleDateFormat.parse("22-12-2015");
            employee1.setExperience(date);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        Employee employee2 = new Employee(5678, "Itto", 27, 600);
        try{
            Date date = simpleDateFormat.parse("10-04-2020");
            employee2.setExperience(date);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        employeeDB.save(employee1);
        employeeDB.save(employee2);
        System.out.println("Employee list after saving: ");
        employeeDB.get();



        //TASK 6
        List<Employee> filteredEmployees = employeeDB.salaryFilter(1000);
        System.out.println("Employees with salary greater than 1000: ");
        PrintLists.printEmployeeList(filteredEmployees);


        //TASK 5
        filteredEmployees = employeeDB.ageFilter(21);
        System.out.println("Employees of age 27: ");
        PrintLists.printEmployeeList(filteredEmployees);


        //TASK 7
        List<Double> salaries = employeeDB.incrementMapper(5);
        System.out.println("Salaries after 5% increment: ");
        PrintLists.printGenericList(salaries);


        //TASK 8
        Double totalSalary = employeeDB.totalSalaryOfFilteredEmployee(100);
        System.out.println("Total salary of filtered list: " + totalSalary);

    }
}
