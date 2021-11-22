package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    // add a new method
    public List<Account>  findAccounts(boolean tripWire)
    {
         if(tripWire)
         {
             throw new RuntimeException("No soup for you!!!");
         }
        List<Account> myAccounts = new ArrayList<>();

        // create sample accounts
          Account temp1 = new Account("John", "Silver");
        Account temp2 = new Account("Madhu", "Platinum");
        Account temp3 = new Account("Luca", "Gold");


        // add them to our accounts lisst
        myAccounts.add(temp1);
        myAccounts.add(temp2);
         myAccounts.add(temp3);

        return myAccounts;
    }

}
