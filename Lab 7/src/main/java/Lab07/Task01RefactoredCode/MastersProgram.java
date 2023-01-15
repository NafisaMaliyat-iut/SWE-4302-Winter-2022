package Lab07.Task01RefactoredCode;

public class MastersProgram {
    private IMastersProgram type;
    private String major;

    //constructor
    public MastersProgram(DegreeType type, String major) {

        this.type = chooseMastersprogram(type,major);
    }


    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }
    public IMastersProgram chooseMastersprogram(DegreeType type, String major) {
        IMastersProgram master;
        if(type.equals(DegreeType.RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.RegularNonThesis)) {
            master = new RegularNonThesis(major);
        } else master = new Executive(major);
        return master;
    }
}
