package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldCalculateBalance() {
		assertEquals(
				7000,
				DemoApplication.calculateBalance(10000, 3000)
		);
	}

	@Test
	void shouldCheckLoanEligibility() {
		assertTrue(
				DemoApplication.isEligibleForLoan(15000, 700)
		);

		assertFalse(
				DemoApplication.isEligibleForLoan(8000, 700)
		);

		assertFalse(
				DemoApplication.isEligibleForLoan(15000, 600)
		);
	}

	@Test
	void shouldReturnAccountStatus() {
		assertEquals(
				"ACTIVE",
				DemoApplication.getAccountStatus(5000)
		);

		assertEquals(
				"EMPTY",
				DemoApplication.getAccountStatus(0)
		);
	}

	@Test
	void shouldCalculateInterest() {
		assertEquals(
				500,
				DemoApplication.calculateInterest(10000, 5)
		);
	}
}