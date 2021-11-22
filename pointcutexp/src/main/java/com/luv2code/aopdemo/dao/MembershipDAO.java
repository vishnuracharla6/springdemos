package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
public class MembershipDAO {

	Logger logger =Logger.getLogger(Driver.class.getName());
	public boolean addSillyMember() {
		
		logger.info(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
		return true;
	}
	public void goToSleep()
	{

		logger.info(getClass() + ": Iam goimg to sleep now");
	}
}
