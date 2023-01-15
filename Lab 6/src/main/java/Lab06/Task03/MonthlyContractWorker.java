package Lab06.Task03;

public class MonthlyContractWorker extends Worker{
    public MonthlyContractWorker (int workingDays, double baseWage){
        super.workingDays = workingDays;
        super.baseWage = baseWage;
    }

    @Override
    public double calculateYearlyVacation() {
        return 21;
    }

    @Override
    public double calculateYearlyWage() {
        return super.baseWage * 12;
    }
}
