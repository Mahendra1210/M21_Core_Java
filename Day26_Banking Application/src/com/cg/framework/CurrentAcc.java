package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		
	}
	public void Withdraw(float amount)
	{
		float accBal=this.getAccBal();
		if(amount<=creditLimit)
		{
			if(amount<accBal)
			{
				accBal-=amount;
				this.setAccBal(accBal);
				System.out.println("Account No is: "+this.getAccNo()+" | " +"Account Name is: " + this.getAccNm()+" |" +  " Account balance is: "+accBal+" | "  +"Withdrawal amount is: "+amount);
			}
			else
			{
				System.out.println("Enter amount less than account balance");
			}
		}
		else
		{
			System.out.println("Enter amount within credit limit range");
		}
			
	}
		
	
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	

}
