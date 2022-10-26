package org.greatLearning.Service;

import org.greatLearning.Model.Employee;

public interface CredentialService {
    public String generatePassword();
    public String generateEmailAddress(String department, Employee employee);
    public void showCredentials(String department, Employee employee);
}
