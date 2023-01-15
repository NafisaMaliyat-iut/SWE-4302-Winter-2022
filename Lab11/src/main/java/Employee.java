import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID=-1;
    private String name="";
    private int experience=0;
    private double salary=0;
    private int age;


    public void setExperience(Date joining){
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(joining);
        LocalDateTime now = LocalDateTime.now();
        int years = now.getYear() - calendar.get(Calendar.YEAR);
        this.experience = years;
    }

    public int getExperience(){
        return experience;
    }

    public String toString(){
        return ID + "," + name + "," + experience + "," + age + "," + salary + "\n" ;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getID(){
        return ID;
    }


    public Employee(int ID, String name, int age, double salary){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(int ID, String name,  int experience, int age, double salary){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }

    public void setID(int newID){
        this.ID = newID;
    }

    public void setName(String name){
        this.name = name;
    }

}
