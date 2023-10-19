package exe_salary.employee;

public class salary {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary -= tax ;
    }

    public void addSalary (double grossSalary) {
        this.grossSalary += grossSalary;
    }
}
