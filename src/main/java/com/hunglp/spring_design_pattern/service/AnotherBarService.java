package com.hunglp.spring_design_pattern.service;

import com.hunglp.spring_design_pattern.beans.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnotherBarService {

    private final SingletonBean singletonBean;

    @Autowired
    public AnotherBarService(SingletonBean singletonBean) {
        this.singletonBean = singletonBean;
    }

    public void doSomething() {
        System.out.println("AnotherBarService doing something. Using singleton : " + singletonBean.getName());
    }
}
