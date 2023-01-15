package Lab07.Task01RefactoredCode;

public interface IMastersProgram {
    public abstract boolean isEligible(float cgpa, String major);
    public abstract int getMarks(int theoryMarks, int thesisMarks, int projectMarks);
}
