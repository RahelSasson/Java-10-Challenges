//BS'D
/*
Write a class named ProductionWorker that extends the Employee class. The
ProductionWorker class should have fields to hold the following information:
•	 Shift (an integer)
•	 Hourly pay rate (a double)
The workday is divided into two shifts: day and night. The shift field will be an integer value
representing the shift that the employee works. The day shift is shift 1 and the night shift is
shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
the class.
 */
public class ProductionWorker extends Employee {
    public int shift;
    private double payRate;

    public ProductionWorker(String employeeName, String employeeNumber, String date, int shift, double payRate) {
        super(employeeName,employeeNumber,date);
        this.shift = shift;
        this.payRate = payRate;
    }

    public String getShift() {
        if(shift == 1)
            return "Day shift";
        if(shift == 2)
            return "Night shift";
        return "invalid input for employee shift format 1/2 - Day/Night";
    }

    public double getPayRate() {
        return payRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
