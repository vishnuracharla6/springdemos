package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Aspect
@Component
public class MyDemoLoggingAspect {

	Logger logger =Logger.getLogger(Driver.class.getName());

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	//@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	//@Before("execution(* add*(com.luv2code.aopdemo.Account))")
	  //@Before("execution(* add*(..))")
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice()
	{
		logger.info("\n=====>>> Executing @Before advice on method");
	}
}










