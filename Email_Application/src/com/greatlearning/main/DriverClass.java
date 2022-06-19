package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.CredentialService;

import co.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Vilas", "Amadala");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Enter the department");
		System.out.println("1. Technical");
		System.out.println("2. Administration");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
					emp1.getLastName().toLowerCase(), "technical");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generatedEmail, generatedPassword);

		} else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
					emp1.getLastName().toLowerCase(), "administration");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generatedEmail, generatedPassword);

		} else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
					emp1.getLastName().toLowerCase(), "human Resources");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generatedEmail, generatedPassword);
		} else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
					emp1.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generatedEmail, generatedPassword);

		} else
			System.out.println("Invalid option");
	}

}
