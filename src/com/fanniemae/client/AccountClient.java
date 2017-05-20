package com.fanniemae.client;


import java.io.IOException;
import com.fanniemae.beans.Account;
import com.fanniemae.contract.IAccDAO;
import com.fanniemae.dao.AccDAO;


public class AccountClient {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Account account = new Account (400,300,3000.00,500.00);
		Account account = new Account(500,345,5000.00);
		IAccDAO  dao= new AccDAO();
		
		System.out.println(dao.insertAcct(account)?"Inserted":"Sorry Not inserted");
		
		Account accountInfo = dao.getAcct(500);
		
		System.out.println(accountInfo);
		
		//Account acc1 = new Account(001,100,1000.00);
		
		Account acc = new Account(500);
				System.out.println(dao.updateAcct(acc)? "Record Updated":"Sorry Record not updated");
		
		 	
	}
}
