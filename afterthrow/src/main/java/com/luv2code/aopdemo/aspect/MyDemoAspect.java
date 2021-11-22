package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
@Aspect
public class MyDemoAspect {

    @AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",throwing = "theExc")
    public void findThrowingFindAccountsDevice(JoinPoint theJoinPoint,Throwable theExc)
    {
        Logger logger =Logger.getLogger(Driver.class.getName());

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        logger.info("\n=====>>> Executing @AfterThrowing on method: " + method);

        // log the exception
        logger.info("\n=====>>> The exception is: " + theExc);

    }
    @After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void findFinallyFindAccountsDevice(JoinPoint theJoinPoint)
    {
        Logger logger =Logger.getLogger(Driver.class.getName());

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        logger.info("\n=====>>> Executing @Afterfinally on method: " + method);

    }
}
