package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {

	Logger logger = Logger.getLogger(Driver.class.getName());
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		logger.info("\n=====>>> Performing API analytics");
	}

}
