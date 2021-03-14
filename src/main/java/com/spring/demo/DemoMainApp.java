package com.spring.demo;

import com.spring.demo.dao.AccountDao;
import com.spring.demo.dao.MembershipDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainApp {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext appConn = new AnnotationConfigApplicationContext(DemoConfig.class);
    AccountDao accountDao = appConn.getBean("accountDao", AccountDao.class);
   MembershipDao membershipDao=appConn.getBean("membershipDao", MembershipDao.class);
   Account theAccount = new Account();
    accountDao.addAccount(theAccount, true);
    accountDao.doWork();
    System.out.println("===============================");
    membershipDao.addSillyMember();
    membershipDao.goToSleep();

    appConn.close();
    }
}
