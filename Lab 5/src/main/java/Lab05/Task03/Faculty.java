package Lab05.Task03;

public class Faculty extends Person{
    String Designation;

    @Override
    public String toString(){
        return super.toString() + " " + Designation;
    }

    public Faculty(String name, String address, int age, String Designation){
        super(name, address, age);
        this.Designation = Designation;
    }


}
