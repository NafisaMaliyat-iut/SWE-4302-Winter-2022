package Lab07.Task01Solution2;

import Lab07.Task01RefactoredCode.DegreeType;
import Lab07.Task01RefactoredCode.Executive;
import Lab07.Task01RefactoredCode.IMastersProgram;
import Lab07.Task01RefactoredCode.RegularNonThesis;
import Lab07.Task01RefactoredCode.RegularThesis;

public class mastersProgramFactory {

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
