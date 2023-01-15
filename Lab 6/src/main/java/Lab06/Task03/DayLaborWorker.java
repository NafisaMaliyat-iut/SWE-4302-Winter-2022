package Lab06.Task03;

public class DayLaborWorker extends Worker{

    public DayLaborWorker(int workingDays, double baseWage){
        super.workingDays = workingDays;
        super.baseWage = baseWage;
    }
    @Override
    public double calculateYearlyVacation() {
        return 0;
    }

    @Override
    public double calculateYearlyWage() {
        return 12 * (super.workingDays * super.baseWage/25);
    }
}
