package exe_salary.app;

import exe_salary.employee.salary;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        salary salaryy = new salary();

        System.out.print("Enter your name: ");
        salaryy.name = sc.nextLine();

        System.out.print("Enter your gross salary: ");
        salaryy.grossSalary = sc.nextDouble();

        System.out.print("Enter your tax: ");
        salaryy.tax = sc.nextDouble();

        System.out.println("Your net salary is: "+ salaryy.netSalary());

        System.out.println("Increase salary: ");
        double grossSalary = sc.nextDouble();
        salaryy.addSalary(grossSalary);

        System.out.println("Hello "+salaryy.name+" your now salary is: "+ salaryy.grossSalary);

    }
}
