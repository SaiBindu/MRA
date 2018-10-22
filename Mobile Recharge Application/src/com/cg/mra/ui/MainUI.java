package com.cg.mra.ui;


import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;



public class MainUI {
	public static void main(String args[]) throws AccountException {
		
		
		int ch = 0;
		AccountService service = new AccountServiceImpl();
		Account account = new Account();
		
		Scanner sc =  new Scanner(System.in);
		do {
			System.out.println("1.Account Balance Enquiry: ");
			System.out.println("2.Recharge Account:");
			System.out.println("3.Exit");
		   
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the MobileNo: ");
				String mobileno = sc.next();
				account = service.getAccountDetails(mobileno);
				if(account == null) {
					System.err.println("Given Account Id does not Exists");
				}
				else{
					
						System.out.println(account.getAccountBalance()+ " ");				
					
				}
				break;
				
			
			case 2:
				System.out.println("Enter the MobileNo:");
				mobileno= sc.next();
				
				System.out.println("Enter Recharge Amount: ");
				double rechargeAmount = sc.nextDouble();
				account = service.getAccountDetails(mobileno);
				double recharge = service.rechargeAccount(mobileno, rechargeAmount);
				if(account == null) {
					System.err.println("Cannot Recharge Account as Given Mobile No Does Not Exits");
				}
				else{
					account.setAccountBalance(account.getAccountBalance()+recharge);
					System.out.println("Your Account Recharged Successfully");
					System.out.println("Hello " +account.getCustomerName() + ","+"Available Balance is " + account.getAccountBalance());
				}
				break;
			case 3:
				exit();
				break;
			}
				
		}while(ch != 4);
		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}
