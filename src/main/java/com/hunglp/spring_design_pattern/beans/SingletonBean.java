package com.hunglp.spring_design_pattern.beans;

public class SingletonBean {
    private String name;

    public SingletonBean(String name){
        this.name = name;
        System.out.println("SingletonBean : " + name + " was created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
