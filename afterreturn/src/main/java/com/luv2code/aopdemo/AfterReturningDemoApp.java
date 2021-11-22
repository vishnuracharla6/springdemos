package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Driver;
import java.util.List;
import java.util.logging.Logger;

public class AfterReturningDemoApp {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Driver.class.getName());
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        //call method to find the accounts
        List<Account> theAccounts = theAccountDAO.findAccounts();

        //display the accounts
        logger.info("\n\nMain program :AfterReturningDemoApp");
        logger.info(".....");

        logger.info(String.valueOf(theAccounts));

        logger.info("/n");

        //close the context
        context.close();

    }
}
