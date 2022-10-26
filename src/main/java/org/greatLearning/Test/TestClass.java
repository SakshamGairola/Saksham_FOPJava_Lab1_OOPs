package org.greatLearning.Test;

import org.greatLearning.Model.Employee;
import org.greatLearning.Service.CredentialService;
import org.greatLearning.Service.CredentialServiceImpl;

import java.util.Scanner;

public class TestClass {

    Scanner sc = new Scanner(System.in);
    CredentialService credentialService = new CredentialServiceImpl();

    public TestClass() {
        Run();
    }

    public void Run(){

        System.out.println("Please enter First and Last Name");
        System.out.print("First Name: ");
        String firstName = sc.next();
        System.out.print("Last Name: ");
        String lastName = sc.next();

        Employee newEmployee = new Employee(firstName, lastName);

        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int option = Integer.parseInt(sc.next());

        switch (option) {
            case 1 -> {
                System.out.println("Dear " + newEmployee.getFirstName() + " your generated credentials are as follows");
                credentialService.showCredentials("tech", newEmployee);
            }
            case 2 -> {
                System.out.println("Dear " + newEmployee.getFirstName() + " your generated credentials are as follows");
                credentialService.showCredentials("admin", newEmployee);
            }
            case 3 -> {
                System.out.println("Dear " + newEmployee.getFirstName() + " your generated credentials are as follows");
                credentialService.showCredentials("hr", newEmployee);
            }
            case 4 -> {
                System.out.println("Dear " + newEmployee.getFirstName() + " your generated credentials are as follows");
                credentialService.showCredentials("legal", newEmployee);
            }
        }
    }
}
