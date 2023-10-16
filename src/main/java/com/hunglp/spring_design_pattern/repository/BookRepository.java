package com.hunglp.spring_design_pattern.repository;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class BookRepository {

    public void doQuery(){

    }
}





