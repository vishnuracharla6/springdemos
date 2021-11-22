package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class AccountDAO {
    Logger logger =Logger.getLogger(Driver.class.getName());

    private String name;
    private String serviceCode;

    //add a new method :findAccounts()

    public List<Account> findAccounts(){

        List<Account>myAccounts = new ArrayList<>();

        // create sample accounts

        Account temp1 = new Account("John", "Silver");
        Account temp2 = new Account("Madhu", "Platinum");
        Account temp3 = new Account("Luca", "Gold");

        // add them to our accounts list
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }
    public String getName()
    {
        logger.info(getClass()+"in getName");
        return name;
    }
    public void setName(String name) {
        logger.info(getClass()+":in setName");
        this.name = name;
    }

    public String getServiceCode() {

        logger.info(getClass()+":in getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        logger.info(getClass()+":in setServiceCode");
        this.serviceCode = serviceCode;
    }
    public void addAccount(Account theAccount, boolean vipFlag)
    {

        logger.info(getClass()+":DOING MY DB WORK : ADDING AN ACCOUNT");
    }
    public boolean doWork(){
        logger.info(getClass()+":doWork");
        return false;
    }


}
