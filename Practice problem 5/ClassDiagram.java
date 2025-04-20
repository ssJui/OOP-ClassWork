import java.util.*;

class Employee {
    String employeeName;
    int employeeId;
    String employeeDepartment;
    void calculatePay() {
        System.out.println(employeeName + " with ID: " + employeeId + " of department: " + employeeDepartment + " has a salary of ");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    void calculatePay () {
        System.out.println(employeeName + " with ID: " + employeeId + " of department: " + employeeDepartment + " has a salary of " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double ratePerHour;
    int totalHoursWorked;
    void calculatePay () {
        System.out.println(employeeName + " with ID: " + employeeId + " of department: " + employeeDepartment + " has a salary of " + ratePerHour * totalHoursWorked);
    }
}

class ContractEmployee extends Employee {
    String assignedProject;
    double totalContractAmount;
    void calculatePay() {
        System.out.println(employeeName + " with ID: " + employeeId + " of department: " + employeeDepartment + " has a contract amount of " + totalContractAmount + " for " + assignedProject);
    }
}

public class ClassDiagram {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee();
        fullTimeEmp.employeeName = "Fardin";
        fullTimeEmp.employeeId = 20229374;
        fullTimeEmp.employeeDepartment = "Accounting";
        fullTimeEmp.monthlySalary = 50000;

        PartTimeEmployee partTimeEmp = new PartTimeEmployee();
        partTimeEmp.employeeName = "Hasan";
        partTimeEmp.employeeId = 20229395;
        partTimeEmp.employeeDepartment = "HR";
        partTimeEmp.ratePerHour = 25;
        partTimeEmp.totalHoursWorked = 26;

        ContractEmployee contractEmp = new ContractEmployee();
        contractEmp.employeeName = "Maha";
        contractEmp.employeeId = 20229352;
        contractEmp.employeeDepartment = "IT";
        contractEmp.assignedProject = "Project X";
        contractEmp.totalContractAmount = 100000;

        fullTimeEmp.calculatePay();
        partTimeEmp.calculatePay();
        contractEmp.calculatePay();
    }
}

