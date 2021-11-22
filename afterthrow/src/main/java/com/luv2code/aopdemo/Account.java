package com.luv2code.aopdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Account {

    private String name;
    private String level;
    public Account()
    {

    }
    public Account(String name,String level)
    {
        this.name=name;
        this.level=level;
    }
}
