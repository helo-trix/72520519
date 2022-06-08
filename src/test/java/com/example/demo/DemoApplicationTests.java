package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.thing.ThingRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/testContext.xml")
class DemoApplicationTests {

	@Autowired
	private ThingRepository repo;

	@Test
	public void test() {
		repo.getThings();
	}
}