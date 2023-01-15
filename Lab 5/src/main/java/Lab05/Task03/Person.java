package Lab05.Task03;

public class Person {
    String name;
    String address;
    int age;

    @Override
    public String toString(){
        return name + " " + address + " " + age;
    }

    public Person (String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

}
