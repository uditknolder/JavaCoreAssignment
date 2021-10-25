package Question21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        EmployeeDetail[] obj = new EmployeeDetail[3];
        obj[0] = new EmployeeDetail("Udit",1,"knolder");
        obj[1] = new EmployeeDetail("Raj",2,"knolder");
        obj[2] = new EmployeeDetail("Ud",3,"knolder");

        emp.setDetails(obj);

        EmployeeDetail[] lectures1 = emp.getDetails();
        for (EmployeeDetail employeeDetail : lectures1) {
            System.out.print(employeeDetail.getId() + " ");
            System.out.print(employeeDetail.getName() + " ");
            System.out.print(employeeDetail.getDesignation() + " ");
            System.out.println();
        }
    }
}
