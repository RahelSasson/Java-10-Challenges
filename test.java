//BS'D
import java.text.ParseException;

public class test {
    public static void main(String[] args) throws ParseException {

        ProductionWorker worker1 = new ProductionWorker("Luffy", "333-m", "11191999",1,220);

        System.out.println("Employee: " + worker1.getEmployeeName() + " " + worker1.getEmployeeNumber() + " Hire Date:" + worker1.getHireDate());
        System.out.println("Shift: " + worker1.getShift() + " Pay Rate: " + worker1.getPayRate());

        System.out.println();

        ShiftSupervisor supervisor = new ShiftSupervisor("Ken Kaneki","555-L", "03141951");
        System.out.println("Supervisor: " + supervisor.getEmployeeName() + " " + supervisor.getEmployeeNumber() + " Hire Date:" + supervisor.getHireDate());

        supervisor.setAnnualSalary(300000);
        supervisor.determineBonusStatus(150000);
        System.out.println("Annual Salary:" + supervisor.getAnnualSalary() + " Production Bonus" + supervisor.getAnnualProductionBonus());


        System.out.println();

        ProductionWorker worker = new ProductionWorker("Eren", "444-a", "09221989", 2, 33);
        TeamLeader leader = new TeamLeader(worker, 15);
        System.out.println("Team Leader: " + leader.getEmployeeName() + " " + leader.getEmployeeNumber() + " Hire Date:" + leader.getHireDate());
        System.out.println("Shift: " +leader.getShift() + " Pay Rate: " + leader.getPayRate());
        System.out.println("Monthly Bonus:" + leader.getMonthlyBonus());

    }
}
