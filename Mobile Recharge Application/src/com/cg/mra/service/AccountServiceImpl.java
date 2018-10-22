package com.cg.mra.service;

import java.util.ArrayList;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountException;

public class AccountServiceImpl implements AccountService{
	AccountDao dao;
	public AccountServiceImpl() {
		super();
		dao= new AccountDaoImpl();
		
		
	}
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		
		try {
			return dao.rechargeAccount(mobileNo, rechargeAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rechargeAmount;
		
	}
	@Override
	public Account getAccountDetails(String mobile) {
		// TODO Auto-generated method stub
		try {
			return dao.getAccount(mobile);
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
