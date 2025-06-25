package com.pl.premier_zone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PremierZoneApplicationTests {

	@Value("${spring.datasource.username}")
	private String dbUser;

	@Test
	void contextLoads() {
		System.out.println("✅ Using DB user: " + dbUser);
	}
}
