package com.spring.demo.dao;

import com.spring.demo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public void addAccount(Account account, boolean vipFlaf){

        System.out.println(getClass()+ ":DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork(){
        System.out.println(getClass()+": doWork()");
        return true;
    }
}
