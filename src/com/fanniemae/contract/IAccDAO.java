package com.fanniemae.contract;

import java.util.List;

import com.fanniemae.beans.Account;

public interface IAccDAO {

	public boolean insertAcct(Account account);
	
	public boolean updateAcct(Account acc);
	
	public Account getAcct(int accId);
	
	public List<Account> getAllAccts();
}
