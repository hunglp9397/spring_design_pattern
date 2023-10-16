package com.hunglp.spring_design_pattern;

import com.hunglp.spring_design_pattern.controller.BookController;
import com.hunglp.spring_design_pattern.controller.LibraryController;
import com.hunglp.spring_design_pattern.repository.BookRepository;
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

	@Autowired
	private BookController bookController;

	@Autowired
	private LibraryController libraryController;


	public static void main(String[] args) {
		SpringApplication.run(SpringDesignPatternApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args)  {

		// Vi Du 1
		barService.doSomething();
		anotherBarService.doSomething();

		// Vi du 2
		bookController.bookFunc();
		libraryController.libraryFunc();

	}
}
