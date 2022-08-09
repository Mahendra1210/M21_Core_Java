package com.cg.client;


import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;

import com.cg.framework.SavingAcc;

public class Client {

	

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(741852,"Chris",40000, true);
		CurrentAcc c=new MMCurrentAcc(963258, "Jason", 62450, 20000);
		
				//for Saving account
				System.out.println("Saving Account: ");
				s.Withdraw(10000);
				
				//for Current account
				System.out.println("Current Account: ");
				c.Withdraw(10000);
				System.out.println(s);
				System.out.println(c);

	}

}
