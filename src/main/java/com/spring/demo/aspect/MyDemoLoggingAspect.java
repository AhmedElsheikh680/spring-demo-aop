package com.spring.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//    @Before("execution( * add*())")
//    @Before("execution(* add*(..))")
    @Before("execution(* com.spring.demo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==========> Eecuting @Before Advice On addAccount()");
    }
}
