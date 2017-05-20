package com.fanniemae.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import com.fanniemae.beans.Account;

import com.fanniemae.connection.GetAccountConnection;

import com.fanniemae.contract.IAccDAO;

public class AccDAO implements IAccDAO {

	public boolean insertAcct(Account account){
		String sql = "insert into account values(?,?,?,?)";
		GetAccountConnection gc1 = new GetAccountConnection();
		
		try {
	          gc1.ps2 = GetAccountConnection.getMySQLConnection().prepareStatement(sql);
	          gc1.ps2.setInt(1, account.getAccId());
	          gc1.ps2.setInt(2, account.getAccNum());
	          gc1.ps2.setDouble(3, account.getBalance());
	          gc1.ps2.setDouble(4,account.getAvgBalance());	
	          
			return (gc1.ps2.executeUpdate() > 0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return false;
	}
	
	public boolean updateAcct(Account acc) {
		
		String sql = "update account set  Average_Balance = ? where Id = ?";
		boolean p = false;
		GetAccountConnection gc1 = new GetAccountConnection ();
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("enter the Percentage");
		
	
		try {
			
			gc1.ps2 = GetAccountConnection.getMySQLConnection().prepareStatement(sql);
			double avgbal = Double.parseDouble(br.readLine());
			System.out.println(avgbal);
			gc1.ps2.setInt(2, acc.getAccId());
			gc1.ps2.setDouble(1, avgbal);
		
			int i = gc1.ps2.executeUpdate();
			if(i==0)
			{
				p=false;
			}
			else{
				p=true;
			}
			//return (gc1.ps2.executeUpdate() > 0);           
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
		
		}

	@Override
	public List<Account> getAllAccts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAcct(int accId) {
		String sql = "select * from account where Id =?";
		GetAccountConnection gc1 = new GetAccountConnection();
		try {
			gc1.ps2 = GetAccountConnection.getMySQLConnection().prepareStatement(sql);
			gc1.ps2.setInt(1,accId);
			
			gc1.rs1 = gc1.ps2.executeQuery();
			
			if(gc1.rs1.next()){
				Account temp = new Account();
				
				temp.setAccId(gc1.rs1.getInt(1));
				temp.setAccNum(gc1.rs1.getInt(2));
				temp.setBalance(gc1.rs1.getDouble(3));
				temp.setAvgBalance(gc1.rs1.getDouble(4));
				return temp;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	}
