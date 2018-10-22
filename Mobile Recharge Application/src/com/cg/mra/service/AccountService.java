package com.cg.mra.service;


import com.cg.mra.beans.Account;

public interface AccountService {
	Account getAccountDetails(String mobile);
	double rechargeAccount(String mobileno, double rechargeAmount);

}
