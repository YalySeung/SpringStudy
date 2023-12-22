package com.mvcvue.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* com.mvcvue.controller..*.*(..))")
    @Order(2)
    public void beforeLogger2(JoinPoint joinPoint){
        System.out.println("beforeLogger222");
    }

    @Before("execution(* com.mvcvue.controller..*.*(..))")
    @Order(1)
    public void beforeLogger1(JoinPoint joinPoint){
        System.out.println("beforeLogger111");
    }

    @Before("execution(* com.mvcvue.controller..*.*(..))")
    @Order(3)
    public void beforeLogger3(JoinPoint joinPoint){
        System.out.println("beforeLogger333");
    }
}
