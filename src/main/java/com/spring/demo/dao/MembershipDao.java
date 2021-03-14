package com.spring.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public boolean addSillyMember(){
        System.out.println(getClass()+": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }

    public void goToSleep(){
        System.out.println(getClass()+": I'm Going To Sleep Now..");
    }
}
