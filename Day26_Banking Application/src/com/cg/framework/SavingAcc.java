package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	@SuppressWarnings("unused")
	static final private float MINBAL=1500.00f;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) 
	{
		super( accNo,  accNm,  accBal);
		this.isSalaried = isSalaried;
	}
	
	public void Withdraw(float Bal)
	{
		System.out.println("Account No is: "+this.getAccNo()+" |" + " Account Name is: " + this.getAccNm()+" |" +  " Account Balance is: "+this.getAccBal());
	}

	@Override 
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}


	
}
