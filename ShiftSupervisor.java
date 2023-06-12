/*
In a particular factory, a shift supervisor is a salaried employee who supervises a shift. In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets production goals. Design a ShiftSupervisor class that extends the Employee class you created in
Programming Challenge 1. The ShiftSupervisor class should have a field that holds the
annual salary and a field that holds the annual production bonus that a shift supervisor has
earned. Write one or more constructors and the appropriate accessor and mutator methods
for the class.
 */
//BS'D
public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private final double annualProductionBonus = 10000.00;
    private boolean productionBonusStatus;


    public ShiftSupervisor(String employeeName, String employeeNumber, String date){
        super(employeeName,employeeNumber,date);
        this.annualSalary = 0;
        this.productionBonusStatus = false;
    }
    public ShiftSupervisor (String employeeName, String employeeNumber, String date, double annualSalary,double production) {
        super(employeeName,employeeNumber,date);
        this.annualSalary = annualSalary;
        determineBonusStatus(production);
    }

    public void determineBonusStatus(double production) {
        if(production > 100000.00)
            this.productionBonusStatus = true;
        else
            this.productionBonusStatus = false;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getAnnualProductionBonus() {
        if(productionBonusStatus == true)
            return annualProductionBonus;
        else
            return 00.0;
    }

    public boolean getProductionBonusStatus(){
        return productionBonusStatus;
    }
}
