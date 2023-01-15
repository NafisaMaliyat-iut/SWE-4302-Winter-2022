package Lab07Test.Task01SolutionTest;

import Lab07.Task01RefactoredCode.DegreeType;
import Lab07.Task01RefactoredCode.MastersProgram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MastersProgramTest {
    //test for isEligible method for thesis type
    //case ineligible cgpa
    @Test
    public void isEligibleThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    //test for isEligible for thesis
    //case wrong major
    @Test
    public void isEligibleThesisDifferentMajor() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    //test for getMarks for thesis type
    @Test
    public void getMarksThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(140, marks);
    }





    //test for isEligible method for non thesis
    //case wrong major
    @Test
    public void isEligibleNonThesisDifferentMajor(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    //test for getMarks for non thesis
    @Test
    public void getMarksNonThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }

    @Test
    public void isEligibleExecutive(){
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksExecutive(){
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(80, marks);
    }

}
