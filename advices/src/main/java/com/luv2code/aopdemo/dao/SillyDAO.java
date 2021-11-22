package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.logging.Logger;

@Component
public class SillyDAO {

    Logger logger =Logger.getLogger(Driver.class.getName());

    public boolean addSilly()
    {
        logger.info(getClass() + ": it is from sillyDao class");


        return true;
    }
}
