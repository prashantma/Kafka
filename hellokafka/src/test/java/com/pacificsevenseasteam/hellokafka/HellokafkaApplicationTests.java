package com.pacificsevenseasteam.hellokafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
class HellokafkaApplicationTests {

	@Test
	void contextLoads() {
	}

}
