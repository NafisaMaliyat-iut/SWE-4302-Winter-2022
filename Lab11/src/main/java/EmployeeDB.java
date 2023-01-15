import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDB {

    List<Employee> employeeList = new ArrayList<>();


    public void save(Employee employee){
        FileWriter fw = null;
        try{
            if(employeeList.isEmpty())
                fw = new FileWriter("myfile.txt", false);
            else
                fw=new FileWriter("myfile.txt", true);
            fw.write(employee.toString());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                fw.close();
                employeeList.add(employee);
                System.out.println("File saved successfully");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    //TASK 2
    //impure function since it affects the external attribute employeeList
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


    //TASK 3
    //impure function since it mutates the list parameter
    public List<Employee> add(List<Employee> employees, Employee employee){
        employees.add(employee);
        return employees;
    }



    //TASK 1
    public void get(){
        BufferedReader reader;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            while ((line = reader.readLine())!= null) {
                sb.append(line);
                sb.append("\n");
            }
            reader.close();
            PrintLists.printEmployeeList(parseEmployeeInfo(sb));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private List<Employee> parseEmployeeInfo(StringBuilder sb){
        List<Employee> employees = new ArrayList<>();

        String[] splittedString = sb.toString().split("\n");
        for(String s: splittedString){
            String[] strings = s.split(",");
            employees.add(objectCreation(strings));
        }

        return employees;
    }
    private Employee objectCreation(String[] s){
        Employee employee = new Employee(Integer.parseInt(s[0]), s[1], Integer.parseInt(s[2]),
                Integer.parseInt(s[3]), Double.parseDouble(s[4]));
        return employee;
    }





    //TASK 6
    public List<Employee> salaryFilter(double salary){
        return employeeList.stream()
                .filter(e->e.getSalary() > salary)
                .collect(Collectors.toList());
    }




    //TASK 5
    public List<Employee> ageFilter(int age){
        return employeeList.stream()
                .filter(e->e.getAge() == age)
                .collect(Collectors.toList());
    }


    //TASK 7
    public List<Double> incrementMapper(double incrementPercentage){
        return employeeList.stream()
                .map(e -> e.getSalary() * (1 + .01 * incrementPercentage))
                .collect(Collectors.toList());
    }




    // TASK 8
    public Double  totalSalaryOfFilteredEmployee(double salary){
        List<Employee> emp = employeeList.stream()
                .filter(e->e.getSalary() > salary)
                .collect(Collectors.toList());
        return emp.stream()
                .map(e->e.getSalary())
                .reduce(0.0, (value1, value2) -> value1 + value2);
    }

}
