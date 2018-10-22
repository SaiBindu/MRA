package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

public interface AccountDao {
	Account getAccount(String mobile) throws AccountException;
	double rechargeAccount(String mobileno, double rechargeAmount) throws AccountException;

}
