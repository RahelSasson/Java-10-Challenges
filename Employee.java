/*
Design a class named Employee. The class should keep the following information in fields:
•	 Employee name
•	 Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M.
•	 Hire date
 */
//BS'D
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private Date hireDate;
    private String date;

    public Employee(String employeeName, String employeeNumber, String date)  {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber);
        setDate(date);
        this.date = date;
    }

    private boolean employeeNumberIsValid(String employeeNumber) {
        if(employeeNumber.length() != 5 || employeeNumber.charAt(3) != '-')
            return false;
        String[] strArr = employeeNumber.split("-");
        for(int i = 0; i < strArr[0].length();i++){
            if(Character.isDigit(strArr[0].charAt(i)) == false)
                return false;
        }
        if(Character.isLetter(strArr[1].charAt(0)) == false || Character.toUpperCase(strArr[1].charAt(0)) > 'M')
            return false;

        return true;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if(employeeNumberIsValid(employeeNumber) == true)
            this.employeeNumber = employeeNumber.toUpperCase();
        else
            System.out.println("Invalid input for employee number format ###-L");
        return;
    }
    private void setDate(String date) {

        if(date.length() != 8)
            return;
        try{
            Integer.parseInt(date);
        }catch(NumberFormatException e){
            System.out.println("Invalid input for numeric date format MMddyyyy");
            return;
        }
        try {
            this.hireDate = new SimpleDateFormat("MMddyyyy").parse(date);
        }catch(Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }
        return;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String hireDateString() {
        return date;
    }
}
