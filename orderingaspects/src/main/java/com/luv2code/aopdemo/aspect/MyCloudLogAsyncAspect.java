package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

    Logger logger =Logger.getLogger(Driver.class.getName());
    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void logToCloudAsync()
    {
        logger.info("\n=====>>> Logging to Cloud in async fashion");
    }
}
