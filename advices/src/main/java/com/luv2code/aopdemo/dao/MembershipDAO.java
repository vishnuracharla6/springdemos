package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
public class MembershipDAO {

	Logger logger =Logger.getLogger(Driver.class.getName());
	public void addAccount() {
		
		logger.info(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
	}
}
