package com.example.UniversityEventManagment;

import com.example.UniversityEventManagment.getrequesttests.GETRequestTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UniversityEventManagmentApplicationTests {

	@Test
	void contextLoads() {
		GETRequestTest obj = new GETRequestTest();
		obj.initiateAllrecs();
	}

}
