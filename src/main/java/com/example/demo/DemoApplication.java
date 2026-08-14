package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static double calculateBalance(double deposit, double withdrawal) {
		return deposit - withdrawal;
	}

	public static boolean isEligibleForLoan(double salary, double creditScore) {
		return salary >= 10000 && creditScore >= 650;
	}

	public static String getAccountStatus(double balance) {
		if (balance > 0) {
			return "ACTIVE";
		}

		return "EMPTY";
	}

	public static double calculateInterest(double amount, double rate) {
		return amount * rate / 100;
	}
}
