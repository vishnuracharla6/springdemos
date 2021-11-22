package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	Logger logger =Logger.getLogger(Driver.class.getName());

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {

		logger.info("\n=====>>> Executing @Before advice on method");

		//display the method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();

		//display method arguments
		//get args
		Object args[] =theJoinPoint.getArgs();

		for(Object tempArgs:args)
		{

			System.out.println(tempArgs);
			if(tempArgs instanceof Account)
			{
				Account theAccount=(Account)tempArgs;
				logger.info("the account name"+theAccount.getName());
				logger.info("the account name"+theAccount.getLevel());
			}
		}

		logger.info("Method :"+methodSig);
	}
	
}










