package com.hunglp.spring_design_pattern.config;


import com.hunglp.spring_design_pattern.beans.BasicBean;
import com.hunglp.spring_design_pattern.beans.FooBean;
import com.hunglp.spring_design_pattern.beans.SingletonBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBean singletonBean() {
        return new SingletonBean("1");
    }


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBean anotherSingletonBean() {
        return new SingletonBean("2");
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public FooBean fooBean(){
        return new FooBean();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public BasicBean basicBean(){
        return new BasicBean();
    }
}
