package Lab06.Task03;

public class PermanentWorker extends Worker {

    public PermanentWorker(int workingDays, double baseWage){
        super.workingDays = workingDays;
        super.baseWage = baseWage;
    }

    @Override
    public double calculateYearlyVacation() {
        return 20 + super.workingDays * 0.03;
    }

    @Override
    public double calculateYearlyWage() {
        return 12 * (super.baseWage + super.baseWage* 0.3 + super.baseWage * 2);
    }
}
