package com.hunglp.spring_design_pattern;

import com.hunglp.spring_design_pattern.service.AnotherBarService;
import com.hunglp.spring_design_pattern.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDesignPatternApplication  implements ApplicationRunner {

	@Autowired
	private BarService barService;

	@Autowired
	private AnotherBarService anotherBarService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDesignPatternApplication.class, args);





	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		barService.doSomething();

		anotherBarService.doSomething();
	}
}
