package com.hunglp.spring_design_pattern.controller;


import com.hunglp.spring_design_pattern.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {


    @Autowired
    private BookRepository bookRepository;

    public void bookFunc(){
        System.out.println(bookRepository);
        bookRepository.doQuery();
    }

}
