package com.spring.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public void addSillyMember(){
        System.out.println(getClass()+": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }
}
