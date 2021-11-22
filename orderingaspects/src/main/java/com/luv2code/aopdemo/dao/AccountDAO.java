package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
public class AccountDAO {

    Logger logger =Logger.getLogger(Driver.class.getName());
    private String name;
    private String serviceCode;

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
    public void addAccount(Account theAccount,boolean vipFlag)
    {

     logger.info(getClass()+":DOING MY DB WORK : ADDING AN ACCOUNT");
    }
    public boolean doWork(){
        logger.info(getClass()+":doWork");
          return false;
    }
}
