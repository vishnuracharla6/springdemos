package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Aspect
@Component
public class AroundAspect {

    Logger logger = Logger.getLogger(Driver.class.getName());
    //Handling exceptions
    @Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        //print out method we are advisng on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        logger.info("\n=====>>> Executing @Around on method: " + method);


        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = null;

        try {
             result = theProceedingJoinPoint.proceed();
        }
        catch(Exception e)
        {
            //log the exception
            logger.warning(e.getMessage());

            // give users a custom messagee
            result = "Major accident! But no worries, "
                    + "your private AOP helicopter is on the way!";

            //throw e;
        }

        // get end timestamp
        long end = System.currentTimeMillis();

        // compute duration and display it
        long duration = end - begin;
        logger.info("\n=====> Duration: " + duration / 1000.0 + " seconds");

        return result;

    }




    /*
    //without exceptions
    @Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        //print out method we are advisng on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        logger.info("\n=====>>> Executing @Around on method: " + method);


        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = theProceedingJoinPoint.proceed();

        // get end timestamp
        long end = System.currentTimeMillis();


        // compute duration and display it
        long duration = end - begin;
        logger.info("\n=====> Duration: " + duration / 1000.0 + " seconds");

        return result;
    }*/

    }


