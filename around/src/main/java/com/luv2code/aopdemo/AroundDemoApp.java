package com.luv2code.aopdemo;

import com.luv2code.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Driver;
import java.util.logging.Logger;

public class AroundDemoApp {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Driver.class.getName());

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        TrafficFortuneService theFortuneService =
                context.getBean("trafficFortuneService", TrafficFortuneService.class);

        logger.info("\nMain Program: AroundDemoApp");

        logger.info("Calling getFortune");

        String data = theFortuneService.getFortune();

        logger.info("\nMy fortune is: " + data);

        logger.info("Finished");

        // close the context
        context.close();

    }
}