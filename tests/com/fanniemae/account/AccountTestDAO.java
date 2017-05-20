package com.fanniemae.account;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fanniemae.beans.Account;
import com.fanniemae.dao.AccDAO;

import junit.framework.Assert;

public class AccountTestDAO {
	
@BeforeClass

public static void init(){
	System.out.println("Before Testing");
}

Account acc;
Account acc1;
AccDAO dao;

@Before

public void beforeInsertTest(){
	 
	acc = new Account(004,23456,900.00);
	dao = new AccDAO();
	acc1 = new Account(004);
}  

@Test(timeout=100)

public void accountInsertTest(){
	Assert.assertEquals(true, dao.insertAcct(acc));
}

public void getAccountTest(){
	Assert.assertEquals(true, dao.getAcct(004));
}


public void updateAccountTest(){
	Assert.assertEquals(true, dao.updateAcct(acc1));
}
}

