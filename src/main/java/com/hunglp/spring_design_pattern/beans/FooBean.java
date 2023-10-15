package com.hunglp.spring_design_pattern.beans;


import com.hunglp.spring_design_pattern.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;


public class FooBean {



    private SingletonBean singletonBean;


    public FooBean( ){
        this.singletonBean = new SingletonBean("From Foo");
        System.out.println("FooBean was created ");
    }
}
