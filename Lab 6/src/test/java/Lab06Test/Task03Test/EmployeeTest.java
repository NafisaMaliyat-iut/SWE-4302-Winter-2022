package Lab06Test.Task03Test;
import Lab06.Task03.DayLaborWorker;
import Lab06.Task03.MonthlyContractWorker;
import Lab06.Task03.PermanentWorker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void CheckYearlySalaryAndLeavesDailyWorker(){
        DayLaborWorker dayLaborWorker = new DayLaborWorker(30, 12.5);
        double expectedYearlyVacation = 0;
        assertEquals(expectedYearlyVacation, dayLaborWorker.calculateYearlyVacation());

        double expectedYearlyWage = 12 * (30 * 12.5 / 25);
        assertEquals(expectedYearlyWage, dayLaborWorker.calculateYearlyWage());
    }

    @Test
    public void CheckYearlySalaryAndLeavesPermanentWorker(){
        PermanentWorker permanentWorker = new PermanentWorker(67, 100.75);
        double expectedYearlyVacation = 20 + 67 * 0.03;
        assertEquals(expectedYearlyVacation, permanentWorker.calculateYearlyVacation());

        double expectedYearlyWage = 12 * (100.75 + 100.75 * 0.3 + 100.75 * 2);
        assertEquals(expectedYearlyWage, permanentWorker.calculateYearlyWage());
    }

    @Test
    public void CheckYearlySalaryAndLeavesMonthlyContractWorker(){
        MonthlyContractWorker monthlyContractWorker = new MonthlyContractWorker(17, 30.89);
        double expectedYearlyVacation = 21;
        assertEquals(expectedYearlyVacation, monthlyContractWorker.calculateYearlyVacation());

        double expectedYearlyWage = 12 * 30.89;
        assertEquals(expectedYearlyWage, monthlyContractWorker.calculateYearlyWage());
    }

}
