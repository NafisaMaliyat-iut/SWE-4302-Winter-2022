package Lab07.Task01Solution2;

import Lab07.Task01RefactoredCode.DegreeType;
import Lab07.Task01RefactoredCode.IMastersProgram;

public class MastersProgram {
    private IMastersProgram type;
    private String major;

    //constructor
    public MastersProgram(DegreeType type, String major) {
        this.type = new mastersProgramFactory().chooseMastersprogram(type,major);
    }


    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }
}
