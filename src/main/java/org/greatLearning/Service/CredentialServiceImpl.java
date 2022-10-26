package org.greatLearning.Service;

import org.greatLearning.Model.Employee;

import java.util.Random;


public class CredentialServiceImpl implements CredentialService{

    Employee employee = new Employee();

    @Override
    public String generatePassword() {

        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerCase = upperCase.toLowerCase();
        String numbers = "1234567890";
        String specialChar = "!@#$%^&*/?,.";

        String[] characterSets = new String[] {upperCase, lowerCase, numbers, specialChar};

        Random random = new Random();

        String password = "";

        for(int i = 0; i < 15; i++){
            int characterSetPick = random.nextInt(0, 4); //Picks a random character set
            int characterPick = random.nextInt(0, characterSets[characterSetPick].length()); //Picks a random character from selected set
            password += characterSets[characterSetPick].charAt(characterPick);
        }

        return password;
    }

    @Override
    public String generateEmailAddress(String department, Employee employee) {
        return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department + ".greatLearning.com";
    }

    @Override
    public void showCredentials(String department, Employee employee) {
        System.out.println("Email ---> " + generateEmailAddress(department, employee));
        System.out.println("Password ---> " + generatePassword());
    }
}
