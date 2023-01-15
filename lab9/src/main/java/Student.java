public class Student {
    String ID ="";
    String name;
    ProgramType program;
    float CGPA;

    void setID(String ID){
        try{
            if(ID.length()==9)
                this.ID = ID;
            else
                throw new IDLengthValidationException();
        }
        catch(IDLengthValidationException e ){
            System.out.print(e.message(ID));
        }
    }

    public void setStudentInfo(String ID, String name, ProgramType program, float CGPA){
        setID(ID);
        this.name = name;
        this.program = program;
        this.CGPA = CGPA;
    }

    public String getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public ProgramType getProgram(){
        return this.program;
    }
    public float getCGPA(){
        return this.CGPA;
    }


    public String play(){
        return this.ID + " is playing.\n";
    }

    public String study(){
        return this.ID + " is studying.\n";
    }

    @Override
    public String toString(){
        String studentInfo= "Student ID: " + ID + ", Student Name: " + name + ", Program: " + program
                + ", CGPA: " + CGPA+ "\n";

        return studentInfo;

    }


}


