package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
public class AccountDAO {


	Logger logger =Logger.getLogger(Driver.class.getName());

	public void addAccount(Account theAccount)
	{

		logger.info(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

	}
	/*
	public void addAccount(Account theAccount, boolean vipFlag) {
		
	logger.info(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}*/
	public boolean doWork()
	{
		logger.info(getClass() + ": do work ");

		return true;
	}
}
